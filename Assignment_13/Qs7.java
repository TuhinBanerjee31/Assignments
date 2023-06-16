import java.util.*;

public class Qs7 {
     public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        String str= in.nextLine();

        char arr[]= str.toCharArray();
        String res="";

        for(int i=0; i<arr.length; i++){
            int temp=0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j] && arr[i] != 0){
                    temp=1;
                    arr[j]=0;
                }
            }

            if(temp == 0 && arr[i] != 0){
                res=res+arr[i];
            }
        }

        for(int i=0; i<res.length(); i++){
            System.out.print(res.charAt(i) + " ");
        }
    }
}