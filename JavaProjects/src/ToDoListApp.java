import java.util.Scanner; // input of the numbers
import java.util.ArrayList; //creating an array list

public class ToDoListApp {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            ArrayList<String> tasks = new ArrayList<>(); //storing the list
            boolean running = true; //this is for the boolean if become true
            boolean returnFromTheStart = true;

                System.out.println("=== TO-DO LIST APP ===");
                System.out.println("1. View Task ");
                System.out.println("2. Add Task ");
                System.out.println("3. Remove Task ");
                System.out.println("4. Exit ");
                System.out.print("Choose an option: ");
                int choices = input.nextInt();

                //conditional for the choices
            if (choices == 1){
                System.out.println("Your task:");

                do{
                    System.out.print("Do you want to continue? (Yes or no)");
                    //returnFromTheStart = input.nextLine();
                    if (returnFromTheStart.equals("Yes")){
                        System.print.outln("Staying first");
                    }else if (returnFromTheStart.equals("No")){
                        System.print.outln("Exiting...."))
                    }

                    else {
                        System.print.outln("You need to choose.");
                    }



                    //if (returnFromTheStart.equals("Yes"))
                } while (returnFromTheStart.equals("No"));
                System.print.outln("Okay you're out");





            }else if (choices == 2){
                System.out.println("Enter new task: ");
                String task = input.nextLine();
                tasks.add(task);
                System.out.println("Task added successfully!");


            }else if (choices == 3){
                System.out.println("Remove Task");

            }else if (choices == 4){
                System.out.println("Exit");
            }

        }
}

