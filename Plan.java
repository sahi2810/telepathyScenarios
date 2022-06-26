import java.util.Scanner;

public class Plan {

    private static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        System.out.println("We have the following services:");
        System.out.println("Voice, Database, Admin, Email");
        System.out.println("How many services would you like?");

        int option = input.nextInt();

        switch (option) {
        case 1:
            Scanner input1 = new Scanner(System.in);
            System.out.println("What type of services would you like?");
            System.out.println("1. Voice");
            System.out.println("2. Database");
            System.out.println("3. Admin");
            System.out.println("4. Email");

            int option1 = input1.nextInt();

            switch (option1) {
            case 1:
                System.out.println("Plan cost is: $100");
                break;
            case 2:
                System.out.println("Plan cost is: $150");
                break;
            case 3:
                System.out.println("Plan cost is: $125");
                break;
            case 4:
                System.out.println("Plan cost is: $100");
                break;

            default:
                System.out.println("Invalid features selection, cannot provide plan cost. Cannot proceed further.");

            }
            break;

        case 2:
            Scanner input2 = new Scanner(System.in);
            System.out.println("What type of services would you like?");
            System.out.println("1. Voice");
            System.out.println("2. Database");
            System.out.println("3. Admin");
            System.out.println("4. Email");

            int option2 = input2.nextInt();
            int option3 = input2.nextInt();

            // feature(1,4) -> $100
            if ((option2 == 1 && option3 == 4) || (option2 == 4 && option3 == 1)) {
                System.out.println("Plan cost is: $100");

                // feature(1,3) -> $125
            } else if ((option2 == 1 && option3 == 3) || (option2 == 3 && option3 == 1)) {
                System.out.println("Plan cost is: $125");

                //feature(1,2 -> $235
            } else if ((option2 == 1 && option3 == 2) || (option2 == 2 && option3 == 1)) {
                System.out.println("Plan cost is: $235");

                // feature(2,3) -> $135
            } else if ((option2 == 2 && option3 == 3) || (option2 == 3 && option3 == 2)) {
                System.out.println("Plan cost is: $135");
                
                // feature(3,4) or (2,4) -> $150
            }  else if((option2 == 3 && option3 == 4) || (option2 == 2 && option3 == 4) || (option2 == 4 && option3 == 3) || (option2 == 4 && option3 == 2)) {
                System.out.println("Plan cost is: $150");

            } else
                System.out.println("Invalid features selection, cannot provide plan cost. Cannot proceed further.");

            break;

        case 3:
            Scanner input3 = new Scanner(System.in);
            System.out.println("What type of services would you like?");
            System.out.println("1. Voice");
            System.out.println("2. Database");
            System.out.println("3. Admin");
            System.out.println("4. Email");

            int option4 = input3.nextInt();
            int option5 = input3.nextInt();
            int option6 = input3.nextInt();

            // feature(1,3,4) -> $225
            if ((option4 == 1 && option5 == 3 && option6 == 4) || (option4 == 4 && option5 == 3 && option6 == 1) || (option4 == 4 && option5 == 1 && option6 == 3) || (option4 == 1 && option5 == 4 && option6 == 3) || (option4 == 3 && option5 == 4 && option6 == 1) || (option4 == 3 && option5 == 1 && option6 == 4)) {
                System.out.println("Plan cost is: $225");

                // feature(1,2,3) or feature(1,2,4) -> $235
            } else if ((option4 == 1 && option5 == 2 && option6 == 3) || (option4 == 1 && option5 == 2 && option6 == 4) || (option4 == 1 && option5 == 3 && option6 == 2) || (option4 == 3 && option5 == 2 && option6 == 1) || (option4 == 3 && option5 == 1 && option6 == 2) || (option4 == 2 && option5 == 1 && option6 == 3) || (option4 == 2 && option5 == 3 && option6 == 1) || (option4 == 1 && option5 == 4 && option6 == 2) || (option4 == 4 && option5 == 2 && option6 == 1) || (option4 == 4 && option5 == 1 && option6 == 2) || (option4 == 2 && option5 == 1 && option6 == 4) || (option4 == 2 && option5 == 4 && option6 == 1)){
                System.out.println("Plan cost is: $235");

                // feature(2,3,4) -> $150
            } else if ((option4 == 2 && option5 == 3 && option6 == 4) || (option4 == 2 && option5 == 4 && option6 == 3) || (option4 == 3 && option5 == 2 && option6 == 4) || (option4 == 3 && option5 == 4 && option6 == 2) || (option4 == 4 && option5 == 2 && option6 == 3) || (option4 == 4 && option5 == 3 && option6 == 2)) {
                System.out.println("Plan cost is: $150");
            } else
                System.out.println("Invalid features selection, cannot provide plan cost. Cannot proceed further.");

            break;

        case 4:
            System.out.println("All 4 services will cost $250");
            break;

        default:
            System.out.println("Invalid input, cannot proceed further.");

        }
    }
}
