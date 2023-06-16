import java.util.*;

public class Qs4 {
     public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        String str= in.nextLine();
        int vowels=0, cons=0, scpl=0;
        str=str.toLowerCase();

        for(int i=0; i<str.length(); i++){
            char temp= str.charAt(i);
            if(temp == 'a' || temp== 'e'|| temp == 'i' || temp == 'o' || temp == 'u'){
                vowels++;
            }
            else if(temp == 'b' || temp == 'c' || temp == 'd' || temp == 'f' || temp == 'g' || temp == 'h' || temp == 'j' || temp == 'k' || temp == 'l' || temp == 'm' || temp == 'n' || temp == 'p' || temp == 'q' || temp == 'r' || temp == 's' || temp == 't' || temp == 'u' || temp == 'v' || temp == 'w'|| temp == 'x' || temp == 'y' || temp == 'z'){
                cons++;
            }
            else{
                scpl++;
            }
        }

        System.out.println("Vowels Count= " + vowels);
        System.out.println("Consonents Count= " + cons);
        System.out.println("Special Character Count= " + scpl);
    }
}