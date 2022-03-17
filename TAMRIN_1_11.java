package tamrin_1_11;
import java.util.Scanner;
public class TAMRIN_1_11 {
    static void Ao(int[] array,int s){
        int x=1,n=0,a,b;
        for(int t=1;t<s;t++){
            a=0;
            b=0;
            for(int i=0;i<x;i++){
                a=a+array[i];
            }
            for(int j=x;j<s;j++){
                b=b+array[j];
            }
            if(a==b){
                System.out.println("possible______");
                for(int i=0;i<x;i++){
                   System.out.print(array[i] + " ");
                }
                System.out.print("..... ");
                for(int j=x;j<s;j++){
                    System.out.print(array[j] + " ");
                }
                n++;
            }
            x++;
        }
        if(n==0){
            System.out.println("impossible !");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int s=input.nextInt();
        int[] array=new int[s];
        System.out.println("Enter the member of arry :");
        for(int i=0; i<s; i++){
            array[i]=input.nextInt();
        }
        Ao(array,s);
    }   
}
