package tamrin_1_3;
import java.util.Scanner;
public class TAMRIN_1_3 {
    public static void main(String[] args) {
        int n,x,y,z,s,k;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number...");
        n=input.nextInt();
        System.out.println("___________________________________");
        y=(2*n)-1;
        z=n-1;
        s=n+1;
        for(int i=1;i<=y;i++){
            if(i==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
        for(int i=3;i<=n;i++){
            k=1;
            for(int j=1;j<=z;j++){
                if(j==z){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int l=(z+1);l<s;l++){
                if((k%2)!=0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                k++;
            }
            for(int u=s;u<=y;u++){
                if(u==s){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            z--;
            s++;
            System.out.println("");
        }
        for(int i=1;i<=y;i++){
            if((i%2)!=0){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
        x=n-1;
        y=(2*x)-1;
        z=2;
        s=y-1;
        System.out.print(" ");
        for(int i=1;i<=y;i++){
            if((i%2)!=0){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
        for(int i=3;i<=x;i++){
            k=1;
            System.out.print(" ");
            for(int j=1;j<=z;j++){
                if(j==z){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int l=(z+1);l<s;l++){
                if((k%2)!=0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                k++;
            }
            for(int u=s;u<=y;u++){
                if(u==s){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            z++;
            s--;
            System.out.println("");
        }
        System.out.print(" ");
        for(int i=1;i<=y;i++){
            if(i==x){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.println("___________________________________");
        x=n+1;
        y=(2*x)-1;
        z=x-1;
        s=x+1;
        for(int i=1;i<=y;i++){
            if(i==x){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
        for(int i=3;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(j==z || j==s){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            z--;
            s++;
            System.out.println("");
        }
        x=n;
        y=(2*x)-1;
        z=2;
        s=y-1;
        for(int i=3;i<=x;i++){
            System.out.print(" ");
            for(int j=1;j<=y;j++){
                if(j==z || j==s){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            z++;
            s--;
            System.out.println("");
        }
        System.out.print(" ");
        for(int i=1;i<=y;i++){
            if(i==x){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.println("___________________________________");
    }
    
}
