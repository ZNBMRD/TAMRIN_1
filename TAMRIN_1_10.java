package tamrin_1_10;
import java.util.Scanner;
import java.lang.Math;
public class TAMRIN_1_10 {
    static void AO(char[] ch,int a,int b,int s){
        int x=0,z=0,g,q,asd;
        double t,f=0;
        char[] arr=new char[100];
        for(int i=(s-1);i>=0;i--){
            switch(ch[i]){
                case '0':
                    x=0;
                    break;
                case '1':
                    x=1;
                    break;
                case '2':
                    x=2;
                    break;
                case '3':
                    x=3;
                    break;
                case '4':
                    x=4;
                    break;
                case '5':
                    x=5;
                    break;
                case '6':
                    x=6;
                    break;
                case '7':
                    x=7;
                    break;
                case '8':
                    x=8;
                    break;
                case '9':
                    x=9;
                    break;
                case 'A':
                    x=10;
                    break;
                case 'B':
                    x=11;
                    break;
                case 'C':
                    x=12;
                    break;
                case 'D':
                    x=13;
                    break;
                case 'E':
                    x=14;
                    break;
                case 'F':
                    x=15;
                    break;
                case 'G':
                    x=16;
                    break;
                case 'H':
                    x=17;
                    break;
                case 'I':
                    x=18;
                    break;
                case 'J':
                    x=19;
                    break;
                case 'K':
                    x=20;
                    break;
                case 'L':
                    x=21;
                    break;
                case 'M':
                    x=22;
                    break;
                case 'N':
                    x=23;
                    break;
                case 'O':
                    x=24;
                    break;
                case 'P':
                    x=25;
                    break;
                case 'Q':
                    x=26;
                    break;
                case 'R':
                    x=27;
                    break;
                case 'S':
                    x=28;
                    break;
                case 'T':
                    x=29;
                    break;
                case 'U':
                    x=30;
                    break;
                case 'V':
                    x=31;
                    break;
                case 'W':
                    x=32;
                    break;
                case 'X':
                    x=33;
                    break;
                case 'Y':
                    x=34;
                    break;
                case 'Z':
                    x=35;
                    break;    
            }
            t=x*(Math.pow(a,z));
            f=f+t;
            z++;
        }
        System.out.println(f);
        q=0;
        while(f>0.0){
            t=f%b;
            if(t==0.0){
                arr[q]='0';
            }
            else if(t==1.0){
                arr[q]='1';
            }
            else if(t==2.0){
                arr[q]='2';
            }
            else if(t==3.0){
                arr[q]='3';
            }
            else if(t==4.0){
                arr[q]='4';
            }
            else if(t==5.0){
                arr[q]='5';
            }
            else if(t==6.0){
                arr[q]='6';
            }
            else if(t==7.0){
                arr[q]='7';
            }
            else if(t==8.0){
                arr[q]='8';
            }
            else if(t==9.0){
                arr[q]='9';
            }
            else if(t==10.0){
                arr[q]='A';
            }
            else if(t==11.0){
                arr[q]='B';
            }
            else if(t==12.0){
                arr[q]='C';
            }
            else if(t==13.0){
                arr[q]='D';
            }
            else if(t==14.0){
                arr[q]='E';
            }
            else if(t==15.0){
                arr[q]='F';
            }
            else if(t==16.0){
                arr[q]='G';
            }
            else if(t==17.0){
                arr[q]='H';
            }
            else if(t==18.0){
                arr[q]='I';
            }
            else if(t==19.0){
                arr[q]='J';
            }
            else if(t==20.0){
                arr[q]='K';
            }
            else if(t==21.0){
                arr[q]='L';
            }
            else if(t==22.0){
                arr[q]='M';
            }
            else if(t==23.0){
                arr[q]='N';
            }
            else if(t==24.0){
                arr[q]='O';
            }
            else if(t==25.0){
                arr[q]='P';
            }
            else if(t==26.0){
                arr[q]='Q';
            }
            else if(t==27.0){
                arr[q]='R';
            }
            else if(t==28.0){
                arr[q]='S';
            }
            else if(t==29.0){
                arr[q]='T';
            }
            else if(t==30.0){
                arr[q]='U';
            }
            else if(t==31.0){
                arr[q]='V';
            }
            else if(t==32.0){
                arr[q]='W';
            }
            else if(t==33.0){
                arr[q]='X';
            }
            else if(t==34.0){
                arr[q]='Y';
            }
            else if(t==35.0){
                arr[q]='Z';
            }
            else{
                asd=0;
            }
            f=f/b;
            q++;
        }
        for(int h=(q-1);h>=0;h--){
            System.out.print(arr[h]);
        }
    }
    public static void main(String[] args) {
        int a,b,s;
        String n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number...");
        n=input.nextLine();
        System.out.println("Enter the first base number...");
        a=input.nextInt();
        System.out.println("Enter the second base number...");
        b=input.nextInt();
        s=n.length();
        char[] ch=n.toCharArray();
        AO(ch,a,b,s);
    }
    
}
