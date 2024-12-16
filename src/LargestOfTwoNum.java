import java.util.Scanner;

public class LargestOfTwoNum {
    public static void main(String[] args) {
//        5.Take 2 numbers as input and print the largest number.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println("num1 "+num1+ " is greater.");
        }
        else{
            System.out.println("num2 "+num2+ " is greater.");
        }
    }
}
