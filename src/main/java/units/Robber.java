package units;

import java.util.ArrayList;

public class Robber extends Infantrys{//класс разбойник, наследник класса пехота
    public int danger;//опасность

    public Robber(String name, int x, int y){
        super(name, x, y);
        this.danger=10;
    }

    @Override
    public String getInfo() {
        return "units.Robber";
    }

    @Override
    public void step(ArrayList<Character> team){
        Character nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), position.getDistance(nearestFoe.getCoordinates()));
    }
}
