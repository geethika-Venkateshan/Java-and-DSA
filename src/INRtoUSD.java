import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
//        6.Input currency in rupees and output in USD.
//        1INR=0.012USD
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in INR");
        double inr = input.nextDouble();
        System.out.println(inr+"INR="+(inr*0.012)+"USD");
    }
}
