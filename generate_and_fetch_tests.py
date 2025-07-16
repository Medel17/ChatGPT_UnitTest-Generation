import os
import openai

PROGRAMS_DIR = "programs"
OUTPUT_DIR = "output_tests"
MODEL = "gpt-4-turbo"  # You can change to gpt-3.5-turbo or another model if desired

os.makedirs(OUTPUT_DIR, exist_ok=True)

def generate_prompt(java_file_path):
    with open(java_file_path, 'r', encoding='utf-8') as f:
        code = f.read()
    prompt = (
        "You are an expert Java developer. "
        "Given the following Java method or class, write comprehensive JUnit 5 tests for it. "
        "Include tests for edge cases and typical usage. "
        "Return only the JUnit test class code.\n\n"
        "do not start your response with ```java and end with ```"
        "Do not include assertion messages, comments, or extra text"
        "do not include any other text in your response just the JUnit test class code"
        f"{code}\n"
    )
    return prompt

def get_unit_tests_from_chatgpt(prompt, model=MODEL):
    api_key = os.getenv("OPENAI_API_KEY")
    if not api_key:
        raise ValueError("OPENAI_API_KEY environment variable is not set.")
    client = openai.OpenAI(api_key=api_key)
    response = client.chat.completions.create(
        model=model,
        messages=[
            {"role": "system", "content": "You are a helpful assistant for generating Java unit tests."},
            {"role": "user", "content": prompt}
        ],
        temperature=0.2,
        max_tokens=1500
    )
    return response.choices[0].message.content

def main():
    java_files = [f for f in os.listdir(PROGRAMS_DIR) if f.endswith('.java')]
    for java_file in java_files:
        java_path = os.path.join(PROGRAMS_DIR, java_file)
        print(f"Processing {java_file}...")
        prompt = generate_prompt(java_path)
        try:
            unit_tests = get_unit_tests_from_chatgpt(prompt)
            output_file = os.path.join(OUTPUT_DIR, f"Test_{java_file}")
            with open(output_file, 'w', encoding='utf-8') as f:
                f.write(unit_tests)
            print(f"Generated tests saved to {output_file}")
        except Exception as e:
            print(f"Failed to generate tests for {java_file}: {e}")

if __name__ == "__main__":
    main() 