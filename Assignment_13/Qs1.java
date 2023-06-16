import java.util.*;

public class Qs1 {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        String str= in.nextLine();

        char arr[]= str.toCharArray();
        String res= "";

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[j]= '0';
                }
            }

            if(arr[i] != '0'){
                res=res+arr[i];
            }
        }

        System.out.println(res);
    }
}