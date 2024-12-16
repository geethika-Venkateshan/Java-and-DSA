import java.util.Scanner;

public class NumbersAndOperator {
    public static void main(String[] args) {
//        4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        double num1 = input.nextDouble();
        System.out.println("Enter second number :");
        double num2 = input.nextDouble();
        System.out.println("Enter an operator(+, -, *, /)");
        char operator = input.next().charAt(0);
        if(operator=='+'){
            System.out.println("num1+num2 =" + (num1+num2));
        } else if (operator=='-') {
            System.out.println("num1-num2 = "+ (num1-num2));
        } else if (operator=='*') {
            System.out.println("num1*num2 = " + (num1*num2));
        } else if (operator=='/') {
            if(num2!=0){
                System.out.println("num1/num2 ="+(num1/num2));
            }
            else{
                System.out.println("num2 cannot be zero");
            }

        }
        else{
            System.out.println("please provide valid input(+, -, *, /)");
        }

    }
}
