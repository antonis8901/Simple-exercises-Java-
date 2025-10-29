import java.util.Scanner;

public class SecondClass {
    static class Product{
        String name;
        String description;
        double price;

        public Product(String name,String description,double price){//Constructor
            this.name=name;
            this.description=description;
            this.price=price;
        }
        String Name(String name){
            return name;
        }
        String Description(String description){
            return description;
        }
        double Price(double price){
            return price;
        }

    }
    public static void main(String[] args) {
        System.out.println("Input product details :");
        Scanner scan=new Scanner(System.in);
        System.out.print("Name : ");
        String name1=scan.nextLine();
        System.out.print("Description : ");
        String description1=scan.nextLine();
        System.out.print("Price : ");
        double num=scan.nextDouble();
        Product num1=new Product(name1,description1,num);
        System.out.println(num1.name);
        System.out.println(num1.description);
        System.out.println(num1.price);


    }
}
