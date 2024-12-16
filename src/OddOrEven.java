import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
//        1.Write a program to print whether a number is even or odd, also take input from the user.
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number%2==0){
            System.out.println("The number " +number+ "is even.");
        }
        else{
            System.out.println("The number " +number+ "is odd.");
        }

    }
}
