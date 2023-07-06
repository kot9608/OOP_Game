package units;

import java.util.ArrayList;

public class Monk extends Mages {//монах-персонаж, наследник класса Маги


    public Monk(String name, int x, int y){
        super(name, x, y);
    }


    @Override
    public String getInfo() {
        return "units.Monk";
    }
    @Override
    public void step(ArrayList<Character> team){
        Character nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), position.getDistance(nearestFoe.getCoordinates()));
    }
}