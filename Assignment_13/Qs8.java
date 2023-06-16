import java.util.*;

public class Qs8 {
     public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        String str= in.nextLine();
        
        str=str.toLowerCase();
        str= str.replaceAll(" ", "");

        char arr[]= str.toCharArray();
        Arrays.sort(arr);
        char res='\0';
        int per=0;
        
        for(int i=0; i<arr.length; i++){
            int temp=1;
            if(res != arr[i]){
                for(int j=i+1; j<arr.length; j++){

                if(arr[i] == arr[j]){
                    temp++;
                }
            }

            if(per<temp){
                per=temp;
                res=arr[i];
            }
            }
            else{
                continue;
            }

        }

        System.out.println(res);
    }
}