import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
//        7.To calculate Fibonacci Series up to n numbers.
//        1… 1… 2… 3… 5… 8… 13… 21… 34… 55…
//        0 , 1
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f1=0;
        int f2=1;
        int f=1;
        while(f<=n){
            System.out.println(f);
            f=f1+f2;
            f1=f2;
            f2=f;
        }
    }
}
