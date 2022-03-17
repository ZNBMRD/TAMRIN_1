package tamrin_1_9;
import java.util.Scanner;
import java.lang.Math;
public class TAMRIN_1_9 {
    static void AO(int[] array,int s,int n){
        int x,z=0,c;
        int y=n;
        while(y>0){
            y=y/10;
            z++;
        }
        z=z*3;
        c=z-1;
        int[] arr1=new int[z];
        while(n>0){
            x=n%2;
            n=n/2;
            arr1[c]=x;
            c--;
        }
        for(int i=0;i<s;i++){
            z=0;
            y=array[i];
            while(y>0){
                y=y/10;
                z++;
            }
            z=z*3;
            c=z-1;
            int[] arr2=new int[z];
            while(array[i]>0){
                x=array[i]%2;
                array[i]=array[i]/2;
                arr2[c]=x;
                c--;
            }
            int[] arr3=new int[z];
            for(int j=0;j<z;j++){
                if(arr1[j]==0 && arr2[j]==0){
                    arr3[j]=0;
                }
                if(arr1[j]==1 && arr2[j]==1){
                    arr3[j]=0;
                }
                if(arr1[j]==1 && arr2[j]==0){
                    arr3[j]=1;
                }
                if(arr1[j]==0 && arr2[j]==1){
                    arr3[j]=1;
                }
            }
            z--;
            int f=0;
            double d,v=0;
            while(z>=0){
                d=arr3[f]*(Math.pow(2,z));
                v=v+d;
                z--;
                f++;
            }
            System.out.print(v + " ");
        }
        System.out.println();
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
        int n;
        System.out.print("Enter a number ...");
        n=input.nextInt();
        System.out.println();
        System.out.println("_____________________________________");
        System.out.print("Result : ");
        AO(array,s,n);
    }
    
}
