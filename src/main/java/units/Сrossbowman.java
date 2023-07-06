package units;

import java.util.ArrayList;

public class Сrossbowman extends Shooters {//арбалетчик, наследник класса стрелки
    public int accuracy;//точность

    public Сrossbowman(String name, int x, int y) {
        super(name, x, y);
        this.accuracy=10;
    }
    @Override
    public String getInfo() {
        return "units.Сrossbowman";
    }

    @Override
    public void step(ArrayList<Character> team){
        Character nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), position.getDistance(nearestFoe.getCoordinates()));
    }
}

