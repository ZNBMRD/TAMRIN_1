package tamrin_1_7;
import java.util.Scanner;
public class TAMRIN_1_7 {
    static void AO(int[] array,int s){
        int x=(-100),y=0;
        for(int i=0;i<s;i++){
            if(array[i]<0){
                if(array[i]>x){
                    x=array[i];
                }
            }
            if(array[i]>=0){
                if(array[i]>y){
                    y=array[i];
                }
            }
        }
        System.out.println("___________________________________");
        System.out.println("Result : " + y + " and " + x);
    }
    public static void main(String[] args) {
        int s;
        System.out.println("Enter the size of array:");
        Scanner input=new Scanner(System.in);
        s=input.nextInt();
        int[] array=new int[s];
        System.out.println("Enter the member of arry:");
        for(int i=0; i<s; i++){
            array[i]=input.nextInt();
        }
        AO(array,s);
           
    }
    
}
