import java.util.Scanner;

public class IfDouble {
    public static void main() {
        Scanner scan=new Scanner(System.in);
        double var1=20.00;
        double var2=80.00;
        double sum=var1+var2*100.00;
        System.out.println("Total : "+sum);
        double remain=sum % 40.00;
        boolean result=false;
        if (remain==0){
            result=false;
        }
        else {
            result=true;
        }
        System.out.println("The remains are : "+remain);
    }
}
