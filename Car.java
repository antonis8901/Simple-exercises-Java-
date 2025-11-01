public class Car {
    private double speed;
    private String brand;
    private double weight;
    private double fuelLevel;


    Car() {//no attributes Constructor
        this.speed = 0.0;
        this.brand = "Honda";
        this.weight = 1200.0;
        this.fuelLevel = 100.0;
    }

    Car(double s, String b, double w, double f) {//Constructor with attributes
        this.speed = s;
        this.brand = b;
        this.weight = w;
        this.fuelLevel = f;
    }

    double getSpeed() {//Getters
        return speed;
    }

    String getBrand() {
        return brand;
    }

    double getWeight() {
        return weight;
    }

    double getFuelLevel() {
        return fuelLevel;
    }

    public String toString() {//returns Object's description
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", fuelLevel=" + fuelLevel +
                '}';
    }


    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        Car car1 = new Car(120,"Nissan",1500,50);
        System.out.println(car1);
    }
}

