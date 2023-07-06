package units;

import java.util.ArrayList;

public class Sniper extends Shooters { //снайпер, наследник класса стрелки
    public int accuracy;//точность

    public Sniper(String name, int x, int y) {
        super(name, x, y);
        this.accuracy=15;
    }

    @Override
    public String getInfo() {
        return "units.Sniper";
    }
    @Override
    public void step(ArrayList<Character> team){
        Character nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), position.getDistance(nearestFoe.getCoordinates()));
    }
}



