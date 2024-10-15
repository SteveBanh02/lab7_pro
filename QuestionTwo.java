import java.util.Scanner;
public class QuestionTwo{

    public static boolean checkIfEmail(String userEmail){

        boolean foundAt = false;
        boolean foundDot = false;
        
        for(int i = 0; i < userEmail.length(); i++){

            char emailCharacters = userEmail.charAt(i);

            if(emailCharacters == '@'){
                foundAt = true;
            } else if (emailCharacters == '.'){
                if(foundAt){
                    foundDot = true;
                }
            }
        }
        return foundAt && foundDot && !userEmail.endsWith(".");
    }

    public static void main(String[] args) {

        Scanner user = new Scanner (System.in);

        System.out.println("Please enter an email.");
        String userEmail = user.nextLine();

        if(checkIfEmail(userEmail)){
            System.out.println("This is a valid email");
        }else{
            System.out.println("This is not a valid email");
        }  
    }
}