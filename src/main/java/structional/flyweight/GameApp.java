package structional.flyweight;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Client
 */
public class GameApp {
    public static List<ISoldier> soldiers = new ArrayList<>();

    public static void createSoldier(int numOfSoldier, String nameOfSoldier, int numOfStar) {
        for (int i = 1; i <= numOfSoldier; i++) {
            Context star = new Context("Soldier: " + (soldiers.size() + 1), numOfSoldier);
            ISoldier soldier = SoldierFactory.createSoldier(nameOfSoldier);
            soldier.promote(star);
            soldiers.add(soldier);
        }
    }

//    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        createSoldier(3, "Sky", 3);
//        createSoldier(1, "Land", 2);
//        createSoldier(5, "Sea", 5);
//        long endTime = System.currentTimeMillis();
//        System.out.println("-----");
//        System.out.println("Total soldiers made: "+ soldiers.size());
//        System.out.println("Total time work: "+ Duration.ofMillis(endTime-startTime).getSeconds());
//        System.out.println("Total types of soldier: "+ SoldierFactory.getTotalSoldiers());
//    }
}
