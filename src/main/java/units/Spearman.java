package units;

import java.util.ArrayList;

public class Spearman extends Infantrys{//копейщик, наследник класса Пехота

    public Spearman(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String getInfo() {
        return "units.Spearman";
    }
    @Override
    public void step(ArrayList<Character> team){
        Character nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), position.getDistance(nearestFoe.getCoordinates()));
    }
}

