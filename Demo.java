import java.util.Scanner;

public class Demo {
    public static float calc(int a,int b,char x){
        if (x=='+') {
            return a + b;
        }
        else if (x=='-') {
            return a-b;
        }
        else if (x=='/'){
            return a/b;
        }
        else if (x=='*'){
            return a*b;
        }
        return 0;
    }
public static int  add(int a,int b){
    return a+b;
}
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //String userName=scan.nextLine();
        //System.out.println(userName);
        System.out.println("Please press a number");
        int num1=scan.nextInt();
        System.out.println("Please press another  number");
        int num2=scan.nextInt();
        System.out.print(add(num1,num2));
        System.out.println("Choose a character (+-/*)");
        char string1=scan.next().charAt(0);
        System.out.println(calc(num1,num2,string1));
    }
}
