import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type your password: ");
        String senha = sc.nextLine();
        missingMessages(senha);
        hasValidPassword(senha);

    }

    static void hasValidPassword(String s) {

        if(hasSpecialCharacter(s) && hasValidNumber(s) && hasValidLowerCase(s) && hasValidUpperCase(s)){
            System.out.println("Safe password! ✔");
        } else {
            System.out.println("Not safe password! ❌");
        }

        hasValidLenght(s);

    }

    static boolean hasValidNumber(String s) {
        boolean check = false;
        String regex = "(?=.*[0-9])";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.find()){
            check = true;
        }
        return check;
    }

    static boolean hasValidUpperCase(String s) {
        boolean check = false;
        String regex = "(?=.*[A-Z])";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.find()){
            check = true;
        }
        return check;
    }

    static boolean hasValidLowerCase(String s) {
        boolean check = false;
        String regex = "(?=.*[a-z])";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.find()){
            check = true;
        }
        return check;
    }

    static boolean hasSpecialCharacter(String s) {
        /*!@#$%^&*()-+*/
        boolean check = false;
        String regex = "(?=.*[!@#$%^&()-+])";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.find()){
            check = true;
        }
        return check;
    }

    static void missingMessages(String s){

        if(!hasSpecialCharacter(s)){
            System.out.println("Missing special character.");
        }
        if(!hasValidLowerCase(s)){
            System.out.println("Missing lower case letter");
        }
        if(!hasValidNumber(s)){
            System.out.println("Missing number");
        }
        if(!hasValidUpperCase(s)){
            System.out.println("Missing upper case letter");
        }
    }

    static boolean hasValidLenght(String s){

        boolean check = true;

        if (s.length() < 6) {
            int remainingCharacters = 6 - s.length();
            System.out.println("Add " + remainingCharacters + " more character(s).");
            check = false;
        }
        return check;
    }
}