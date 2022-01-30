package structional.flyweight;

/**
 * Concrete Flyweight
 */
public class Soldier implements ISoldier{
    private final String name; //Intrinsic State

    public Soldier(String name){
        this.name = name;
        System.out.println("Soldier:" + name);
    }

    @Override
    public void promote(Context context){
        System.out.println(name + " " + context.getId() + " Star: " + context.getStar());
    }
}
