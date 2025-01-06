import random

def play_game():
    print("\nWelcome to the Number Guessing Game!")
    lower_bound = 1
    upper_bound = 100
    max_attempts = 10

    # Generate a random number
    number_to_guess = random.randint(lower_bound, upper_bound)
    attempts = 0

    print(f"\nI have chosen a number between {lower_bound} and {upper_bound}. You have {max_attempts} attempts to guess it!")
    
    while attempts < max_attempts:
        try:
            # Prompt the user for their guess
            guess = int(input(f"Attempt {attempts + 1}/{max_attempts}: Enter your guess: "))
            attempts += 1

            # Compare the guess with the generated number
            if guess < number_to_guess:
                print("Too low! Try again.")
          
