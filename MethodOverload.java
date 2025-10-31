public class MethodOverload {
    public static double convertToCentimeters(int a){
        double centimeters=a*2.54;
        return centimeters;
    }
    public static double convertToCentimeters(int a,int b){
        int feet=a*12;
        int inches=b;
        feet+=inches;
        return convertToCentimeters(feet);
        
    }
    static void main(String[] args) {
    System.out.println(convertToCentimeters(5));//inch
    System.out.println(convertToCentimeters(5,7));//feet-inches
    }
}
