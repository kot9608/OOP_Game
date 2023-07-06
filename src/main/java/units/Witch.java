package units;

import java.util.ArrayList;

public class Witch extends Mages{//колдун, наследник класса Маги


    public Witch(String name, int x, int y) {
        super(name, x, y);
    }



    @Override
    public String getInfo() {
        return "units.Witch";
    }

    @Override
    public void step(ArrayList<Character> team){
        Character nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), position.getDistance(nearestFoe.getCoordinates()));
    }
}

