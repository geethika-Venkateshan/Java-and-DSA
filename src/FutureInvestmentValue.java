import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
//        FV = Present value(amount)*(1+annualinetrestrate in %)^time in years
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Present Value(amount): ");
        double price = input.nextDouble();
        System.out.println("Enter Annual Interest Rate In %: ");
        double annualrate = input.nextDouble();
        annualrate = annualrate/100;
        System.out.println("Enter time in years: ");
        int time = input.nextInt();
        double futureValue= price*Math.pow(1+annualrate,time);
        System.out.printf("Future Investment Plan : %.2f%n",futureValue);
        }
}
