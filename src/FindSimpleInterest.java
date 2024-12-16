import java.util.Scanner;

public class FindSimpleInterest {
    public static void main(String[] args) {
//        3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        S.I = (P*R*T)/100
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal(P) :");
        int P = input.nextInt();
        System.out.println("Enter rate(R) :");
        int R = input.nextInt();
        System.out.println("Enter time(T) :");
        int T = input.nextInt();
        System.out.println("S.I = "+(P*R*T)/100);
    }
}
