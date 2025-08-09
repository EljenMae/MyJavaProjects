import java.util.Scanner; //declare for the import user

public class SimpleCalculator{

public static void main(String[] args) {
    String choice;
    Scanner input = new Scanner(System.in); //using scanner input to declare that you wanted to input a string or a number.
    do {
        int total;


        System.out.print("Enter the first number: "); //Entering name
        int firstNum = input.nextInt(); //Integer save for now.

        System.out.print("Enter the operator(+,-,/,*): "); // This is showing what operator should be use.
        String operator = input.next(); //saving the operator that use.

        System.out.print("Enter the second number: "); // Showing to be inputed your second number
        int secondNum = input.nextInt(); // saving what second number that you wanted to use.

        // calculation on getting the total number
        if (operator.equals("+")) {
            total = firstNum + secondNum;
        } else if (operator.equals("-")) {
            total = firstNum - secondNum;
        } else if (operator.equals("/")) {
            total = firstNum / secondNum;
        } else if (operator.equals("*")) {
            total = firstNum * secondNum;
        } else {
            System.out.print("You need to input your operator");
            return;
        }
        System.out.println("Total: " + total); // showing the total in this part

        System.out.print("Do you want to calculate again? (yes/no): ");
        choice = input.next().toLowerCase();

    } while (choice .equals("yes"));
    System.out.println("Thank you for using the calculator!");
    input.close();
}
}