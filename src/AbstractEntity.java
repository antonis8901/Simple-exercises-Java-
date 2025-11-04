public abstract class AbstractEntity implements IEntity,IAlive {
    public String name;
    public double age;
    private String gender;

    @Override
    public void born(){
        System.out.println("born used");
    }
    @Override
    public void die(){
        System.out.println("die used");
    }
    @Override
    public void breathe(){
        System.out.println("Breathes");
    }
    public abstract void wakeUp();
    public abstract void sleep();
}
