public class Human extends AbstractEntity{
    public Human(){}
    public Human(String n,double a){
        this.name = n;
        this.age = a;
    }
    @Override
    public void wakeUp(){
        System.out.println("Woke up used");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep used");
    }
    @Override
    public void born(){
        System.out.println("Born used");
    }
    @Override
    public void die(){
        System.out.println("Die used");
    }
}
