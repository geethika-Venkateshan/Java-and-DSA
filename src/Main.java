import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter roll number: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is "+rollno);
        int temp,hcf;
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int a= num1;
        int b = num2;
        while(b!=0){
            temp= b;
            b=a%b;
            a=temp;
        }
        hcf = a;
        System.out.println("HCF is " + hcf);
        System.out.println("LCM is " + (num1*num2)/hcf);
        }
    }
