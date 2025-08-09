import java.util.Scanner; //declare for the import user

public class SimpleCalculator{

public static void main(String[] args) {
    int total; // This is for the declaration of total that was int(whole numner). You can also use boolean.
    Scanner input = new Scanner(System.in); //using scanner input to declare that you wanted to input a string or a number.

    System.out.print("Enter the first number: "); //Entering name
    int firstNum = input.nextInt(); //Integer save for now.

    System.out.print("Enter the operator(+,-,/,*): "); // This is showing what operator should be use.
    String operator = input.next(); //saving the operator that use.

    System.out.print("Enter the second number "); // Showing to be inputed your second number
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
}
}