import java.util.Scanner;
public  class Overload {
    static class Character {
        String name;
        double health;
        int level;

        public Character() {
            System.out.println("Character with no attributes created");
        }
        public Character(String name){
            System.out.println("Character with Name :"+name+" created");
        }
        public Character(String name,double health){
            System.out.println("Character with Name :"+name+" and health : "+health+" created");
        }
        public Character(String name,double health,int level){
            System.out.println("Character with Name :"+name+" health : "+health+" and level : "+level+" created");
        }

    }
    public static Character create() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose option :");
        System.out.println("0-No attributes");
        System.out.println("1-Name only");
        System.out.println("2-Name and health");
        System.out.println("3-Name,health and level");

        int choice = scan.nextInt();
        scan.nextLine();
        switch (choice) {
            case 0:
                return new Character();
            case 1:
                System.out.println("Insert Character name : ");
                String name = scan.nextLine();
                return new Character(name);
            case 2:
                System.out.println("Insert Character name : ");
                name = scan.nextLine();
                System.out.println("Insert Character health : ");
                double health = scan.nextDouble();
                return new Character(name, health);
            case 3:
                System.out.println("Insert Character name : ");
                name = scan.nextLine();
                System.out.println("Insert Character health : ");
                health = scan.nextDouble();
                System.out.println("Insert Character level : ");
                int level = scan.nextInt();
                return new Character(name, health, level);

            default:
                System.out.println("Invalid input,no attributes");
                return new Character();
        }
    }
    public static void main(String[] args) {
    Character hero=create();



    }
}



