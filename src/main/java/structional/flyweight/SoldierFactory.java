package structional.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory
 */

public class SoldierFactory {
    private static final Map<String, ISoldier> soldiers = new HashMap<>();

    private SoldierFactory() {
        throw new IllegalStateException();
    }

    public static void waitingForCreateASoldier() {
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized ISoldier createSoldier(String name) {
        ISoldier soldier = soldiers.get(name); //fixme: interface?
        if (soldier == null) {
            waitingForCreateASoldier();
            soldier = new Soldier(name);
            soldiers.put(name, soldier);
        }
        return soldier;
    }

    public static synchronized int getTotalSoldiers(){
        return soldiers.size();
    }
}
