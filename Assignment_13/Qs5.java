import java.util.*;

public class Qs5 {
     public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        String str1= in.nextLine();
        String str2= in.nextLine();
        int res=0;

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        str1.replaceAll(" ", "");
        str2.replaceAll(" ", "");

        char arr1[] = new char[str1.length()];
        char arr2[] = new char[str2.length()];

        for(int i=0; i<str1.length(); i++){
            arr1[i]=str1.charAt(i);
        }
        for(int i=0; i<str2.length(); i++){
            arr2[i]=str2.charAt(i);
        }

        for(int i=0; i<arr1.length; i++){
            for(int j=i+1; j<arr1.length; j++){
                if(arr1[i] > arr1[j]){
                    char temp= arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }

        for(int i=0; i<arr2.length; i++){
            for(int j=i+1; j<arr2.length; j++){
                if(arr2[i] > arr2[j]){
                    char temp= arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                res=1;
                break;
            }
        }


        if(res==1){
            System.out.println("It is Not Anagram..");
        }
        else{
            System.out.println("It is Anagram..");
        }

    }
}