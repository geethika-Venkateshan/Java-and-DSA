import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
//        Perfect Number In Java
//        A Perfect Number is a positive integer that is equal to the sum of its proper divisors (excluding itself). For example, 6 is a perfect number because its divisors (excluding itself) are 1, 2, and 3, and their sum is
//        1+2+3=6.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        if(num==sum){
            System.out.println(num+" is a perfect number.");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}
/*
Fun Fact:
Perfect numbers are closely related to Mersenne primes.
If 2^(p-1)2^p-1 is a perfect number, then 2^p-1 must be a prime number, known as a Mersenne prime.
For p=2, 2*2^2-1 = 6 (perfect number).
For p=3, 2^2*(2^3-1) = 28 (perfect number).
 */