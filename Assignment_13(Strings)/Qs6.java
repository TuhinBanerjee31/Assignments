import java.util.*;

public class Qs6 {
     public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        String str1= in.nextLine();
        int flag=0;

        str1=str1.toLowerCase();

        str1= str1.replaceAll(" ", "");

        char arr1[] = new char[str1.length()];
        int res[]= new int[26];

        for(int i=0; i<str1.length(); i++){
            arr1[i]=str1.charAt(i);
        }

        for(int i=0; i<arr1.length; i++){
            res[arr1[i]-97]++;
        }

        
        for(int i=0; i<res.length; i++){
            if(res[i] == 0){
                flag=1;
                break;
            }
        }

        if(flag==1){
            System.out.println("The String Isn't Panagram");
        }
        else{
            System.out.println("The String Isn Panagram");
        }

    }
}