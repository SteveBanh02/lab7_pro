import java.util.Scanner;
public class LabSeven{

    public static String reverseWord(String word){
    
        String reverseString = "";
        
        for(int i = word.length()-1; i >= 0; i--){
            reverseString += word.charAt(i);
        }
        System.out.println("The reverse of your word is " + reverseString);
        return reverseString;
    }

    public static boolean checkIfPalindrome(String word){
        
        word = word.replaceAll("[^a-zA-Z0-9]", "");

        String wordReversed = reverseWord(word);
        for(int i = 0; i < word.length(); i++){

            if(Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(wordReversed.charAt(i))){
                return false;
            }
        }
        return true;
    }
       

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Please enter a palindrome word: ");
        String word = user.nextLine();


        if (checkIfPalindrome(word)){
            System.out.printf("Therefore, \"%s\" is a palindrome", word);
        }else {
            System.out.printf("Therefore, \"%s\" is not a palindrome.", word);
        }
    }
}