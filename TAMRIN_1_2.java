package tamrin_1_2;
import java.util.Scanner;
public class TAMRIN_1_2 { 
    public static void main(String[] args) {
        int n,x,y,z,s,k;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number...");
        n=input.nextInt();
        System.out.println("___________________________________");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("___________________________________");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("___________________________________");
        x=n-1;
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int i=3;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==x){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            x--;
        }
        System.out.println("*");
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
        System.out.println("___________________________________");
        y=(2*n)-1;
        z=2;
        s=y-1;
        for(int i=1;i<=y;i++){
            if((i%2)!=0){
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
            z++;
            s--;
            System.out.println("");
        }
        for(int i=1;i<=y;i++){
            if(i==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
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
        for(int i=1;i<=y;i++){
            if((i%2)!=0){
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
