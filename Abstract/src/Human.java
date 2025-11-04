public class Human extends AbstractEntity {
    public Human() {}

    public Human(String n,int a){
        this.name = n;
        this.age = a;
    }
    @Override
    public void start(){//abstract method
        System.out.println("Starting...");
    }
    @Override
    public void stop(){
        System.out.println("Stopped");
    }
    public String toString(){
        return "Name : "+name+" Age : "+age;
    }
}
