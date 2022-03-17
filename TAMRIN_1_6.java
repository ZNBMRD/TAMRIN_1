package tamrin_1_6;
import java.util.Scanner;

public class TAMRIN_1_6{
      
    static void pushSameMembersToEnd(int n,int[] arr,int s){
        int count =0;
        int r[]=new int[s];
        for(int i=0; i<s; i++){
            
          if(arr[i]!=n)
            r[count++] = arr[i];
        }
        for(int i=count; i<s; i++){
            
            r[i]=n;
          } 

        for (int i = 0; i < s; i++) {
            System.out.print(r[i]);
            System.out.print(" ");

        }
    }

    
    
    public static void main(String[] args){
           
           int s;
           System.out.print("Enter the size of array:");
           Scanner input=new Scanner(System.in);
           s=input.nextInt();
           
           int n;
           System.out.print("Enter a number for comparison;");
           n=input.nextInt();
           System.out.print("Enter the member of arry:");
           int[]arr=new int[s];
           for(int i=0; i<s; i++){
               
               arr[i]=input.nextInt();
           }
           
      

 pushSameMembersToEnd(n,arr,s);
    
 
    }


}