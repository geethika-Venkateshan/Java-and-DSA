import java.util.Scanner;

public class SumOfInputstillX {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        while(true) {
            String num = input.next();
            if (num.equalsIgnoreCase("x")
            ){
                break;
            }
            sum = sum + Integer.parseInt(num);
//            try {
//                sum += Integer.parseInt(num); // Parse input to integer and add to sum
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
//            }
        }
        System.out.println("sum = " +sum);
        input.close();
    }
}
