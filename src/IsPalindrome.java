import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
//       8. To find out whether the given String is Palindrome or not.
//        madam,wow,noon,rotator,...
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.next();
        int size = str.length();
        String result = "";
        for(int i=size-1;i>=0;i--){
            result=result+str.charAt(i);
            System.out.print(str.charAt(i));
        }
        System.out.println();
        if(str.equalsIgnoreCase(result)){
            System.out.println("String "+str+" is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
