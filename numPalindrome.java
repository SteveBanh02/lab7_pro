import java.util.Scanner;
public class numPalindrome{

    public static boolean isPalindrome(int number){

        int original = number;
        int reverse = 0;

        if (original < 0){
            return false;
        }

        while (number > 0){
            reverse = reverse * 10 + number%10;
            number = number/10;
        }

        
        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("enter a palindrome number");
        int number = user.nextInt();

        if (isPalindrome(number)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}