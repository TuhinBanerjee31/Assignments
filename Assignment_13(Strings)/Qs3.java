import java.util.*;

public class Qs3 {
     public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        String str= in.nextLine();
        String res= "";

        for(int i=str.length()-1; i>=0; i--){
            res=res+str.charAt(i);
        }

        if(res.equalsIgnoreCase(str)){
            System.out.println("The String " + str + " is Palindrome.");
        }
        else{
            System.out.println("The String " + str + " is Not Palindrome.");
        }
    }
}