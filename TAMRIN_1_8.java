package tamrin_1_8;
import java.util.Scanner;
public class TAMRIN_1_8 {
    static void AO(int n){
        int x,z,v,s=1,t=1,c=0;
        for(int i=1;i<n;i++){
            for(int j=(i+1);j<=n;j++){
                x=i*j;
                
                int[] arr1=new int[1000];
                int[] arr2=new int[1000];
                z=1;
                s=0;
                while(arr1[s]<x && arr2[s]<x){
                    arr1[s]=i*z;
                    arr2[s]=j*z;
                    z++;
                }
                z--;
                t=0;
                for(int k=0;k<z;k++){
                    for(int w=0;w<z;w++){
                        if(arr1[k]==arr2[w]){
                           t++;
                           c=k;
                        }
                    }
                }
                if(t==0){
                    System.out.print("(" + i + " " + j + ")");
                }
                else{
                    if(arr1[c]!=x){
                        System.out.print("(" + i + " " + j + ")");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number ...");
        n=input.nextInt();
        AO(n);
    }
    
}
