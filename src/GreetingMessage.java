import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
//        2.Take name as input and print a greeting message for that particular name.
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hey " +name+ ",How are you?");
    }
}
