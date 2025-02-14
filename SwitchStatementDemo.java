<<<<<<< HEAD
public class SwitchStatementDemo {
    public static void main(String[] args) {
int dayOfWeek = 4;
switch (dayOfWeek) {
    case 1:
        System.out.println("Monday: Start of the work week.");
        break;
    case 2:
        System.out.println("Tuesday: Keep going!");
        break;
    case 3:
        System.out.println("Wednesday: Midweek.");
        break;
    case 4:
        System.out.println("Thursday: Almost there.");
        break;
    case 5:
        System.out.println("Friday: Weekend is near.");
        break;
    case 6:
        System.out.println("Saturday: Enjoy your day off!");
        break;
    case 7:
        System.out.println("Sunday: Rest and recharge.");
        break;
    default:
        System.out.println("Invalid day.");
}
char studentGrade = 'B';
switch (studentGrade) {
    case 'A':
        System.out.println("Excellent!");
        break;
    case 'B':
        System.out.println("Good job!");
        break;
    case 'C':
        System.out.println("Well done!");
        break;
    case 'D':
        System.out.println("You passed.");
        break;
    case 'F':
        System.out.println("Better luck next time.");
        break;
    default:
        System.out.println("Invalid grade.");
}








=======
import java.util.Scanner; // Import Scanner for user input

public class SwitchStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get day of the week from user
        System.out.print("Enter day of the week (1-7): ");
        int dayOfWeek = scanner.nextInt();

        // Traditional Switch Statement
        switch (dayOfWeek) {
            case 1 -> System.out.println("Monday: Start of the work week.");
            case 2 -> System.out.println("Tuesday: Keep going!");
            case 3 -> System.out.println("Wednesday: Midweek.");
            case 4 -> System.out.println("Thursday: Almost there.");
            case 5 -> System.out.println("Friday: Weekend is near.");
            case 6 -> System.out.println("Saturday: Enjoy your day off!");
            case 7 -> System.out.println("Sunday: Rest and recharge.");
            default -> System.out.println("Invalid day.");
        }

        // Get student grade from user
        System.out.print("Enter your grade (A-F): ");
        char studentGrade = scanner.next().charAt(0);

        // Traditional Switch Statement
        switch (Character.toUpperCase(studentGrade)) {
            case 'A' -> System.out.println("Excellent!");
            case 'B' -> System.out.println("Good job!");
            case 'C' -> System.out.println("Well done!");
            case 'D' -> System.out.println("You passed.");
            case 'F' -> System.out.println("Better luck next time.");
            default -> System.out.println("Invalid grade.");
        }

        scanner.close(); // Close Scanner
>>>>>>> 46c3bcd (Submitting OBJPROG Week 04 - Session 01 - Exercise 04)
    }
}
