package tamrin_1_5;
import java.util.Scanner;
public class TAMRIN_1_5 {
    public static void main(String[] args) {
        int n,u,x,y=0,z,i=0,j=0;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number...");
        n=input.nextInt();
        System.out.println("please enter the base...");
        u=input.nextInt();
        System.out.println("_____________________________________________");
        System.out.print("Result : ");
        char[] array=new char[100] ;
        while(n>0){
            x=n%10;
            n=n/10;
            y=x+y;
        }
        while(y>0){
            z=y%u;
            y=y/u;
            switch(z){
                case 0:
                    array[i]='0';
                    break;
                case 1:
                    array[i]='1';
                    break;
                case 2:
                    array[i]='2';
                    break;
                case 3:
                    array[i]='3';
                    break;
                case 4:
                    array[i]='4';
                    break;
                case 5:
                    array[i]='5';
                    break;
                case 6:
                    array[i]='6';
                    break;
                case 7:
                    array[i]='7';
                    break;
                case 8:
                    array[i]='8';
                    break;
                case 9:
                    array[i]='9';
                    break;
                case 10:
                    array[i]='A';
                    break;
                case 11:
                    array[i]='B';
                    break;
                case 12:
                    array[i]='C';
                    break;
                case 13:
                    array[i]='D';
                    break;
                case 14:
                    array[i]='E';
                    break;
                case 15:
                    array[i]='F';
                    break;
                case 16:
                    array[i]='G';
                    break;
                case 17:
                    array[i]='H';
                    break;
                case 18:
                    array[i]='I';
                    break;
                case 19:
                    array[i]='J';
                    break;
                case 20:
                    array[i]='K';
                    break;
                case 21:
                    array[i]='L';
                    break;
                case 22:
                    array[i]='M';
                    break;
                case 23:
                    array[i]='N';
                    break;
                case 24:
                    array[i]='O';
                    break;
                case 25:
                    array[i]='P';
                    break;
                case 26:
                    array[i]='Q';
                    break;
                case 27:
                    array[i]='R';
                    break;
                case 28:
                    array[i]='S';
                    break;
                case 29:
                    array[i]='T';
                    break;
                case 30:
                    array[i]='U';
                    break;
                case 31:
                    array[i]='V';
                    break;
                case 32:
                    array[i]='W';
                    break;
                case 33:
                    array[i]='X';
                    break;
                case 34:
                    array[i]='Y';
                    break;
                case 35:
                    array[i]='Z';
                    break;    
            }
            i++;
            j++;
        }
        for(int t=(j-1);t>=0;t--){
            System.out.print(array[t]);
        }
        System.out.println();
    }
    
}
