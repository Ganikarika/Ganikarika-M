def calculate_grade(average):
    """Determine the grade based on the average percentage."""
    if average >= 90:
        return "A+"
    elif average >= 80:
        return "A"
    elif average >= 70:
        return "B"
    elif average >= 60:
        return "C"
    elif average >= 50:
        return "D"
    else:
        return "F"

def main():
    print("Welcome to the Marks Calculator!\n")

    try:
        # Get the number of subjects
        num_subjects = int(input("Enter the number of subjects: "))
        if num_subjects <= 0:
            print("Invalid number of subjects. Please restart the program.")
            return

        # Get marks for each subject
        marks = []
        for i in range(1, num_subjects + 1):
            while True:
                try:
                    mark = float(input(f"Enter marks obtained in subject {i} (out of 100): "))
                    if 0 <= mark <= 100:
                        marks.append(mark)
                        break
                    else:
                        print("Marks must be between 0 and 100. Please try again.")
                except ValueError:
                    print("Invalid input. Please enter a number.")

        # Calculate total marks and average percentage
        total_marks = sum(marks)
        average_percentage = total_marks / num_subjects

        # Determine grade
        grade = calculate_grade(average_percentage)

        # Display results
        print("\n----- Results -----")
        print(f"Total Marks: {total_marks:.2f}")
        print(f"Average Percentage: {average_percentage:.2f}%")
        print(f"Grade: {grade}")

    except ValueError:
        print("Invalid input. Please restart the program and enter valid numbers.")

if __name__ == "__main__":
    main()
