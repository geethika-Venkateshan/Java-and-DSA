import java.util.Scanner;

public class FindArmstrongNumber {
    public static void main(String[] args) {
//        9.To find Armstrong Number between two given number.
//        a number that is equal to the sum of cubes of its digits.
//        example 0, 1, 153, 370, 371 and 407
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int start = input.nextInt();
        int end = input.nextInt();

        for(int i=start;i<=end;i++){
            int armstrong = 0;
            int num=i;
            while (num > 0) {
                int temp = num % 10; // Extract the last digit
                armstrong += (temp * temp * temp); // Add cube of the digit
                num /= 10; // Remove the last digit
            }

            // Check if the number is an Armstrong number
            if (i == armstrong) {
                System.out.println(i + " is an Armstrong number");
            }

        }

    }
}
