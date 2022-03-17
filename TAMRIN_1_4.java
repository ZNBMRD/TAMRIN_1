package tamrin_1_4;
import java.util.Scanner;
public class TAMRIN_1_4 {
    public static void main(String[] args) {
        int n,z=0;
        double x,y=0,s=0,k=20;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number of scores...");
        n=input.nextInt();
        System.out.println("please enter " + n + " points...");
        while(n>=1){
            x=input.nextDouble();
            y=y+x;
            if(x>s){
                s=x;
            }
            if(x<k){
                k=x;
            }
            n--;
            z++;
        }
        y=y/z;
        System.out.println("______________________________________");
        System.out.println("GPA = "+y);
        System.out.println("maximum = "+s);
        System.out.println("minimum = "+k);
    }
    
}
