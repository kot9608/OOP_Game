package units;

import java.util.ArrayList;

public class Peasant extends Infantrys  {//класс крестьянин, наследник класса пехота
    public int industriousness;//трудолюбие(коэфицент увеличения силы)
    public Peasant(String name, int x, int y){//конструктор для создания крестьянина, принимает на вход строку стринг
        super(name, x, y);//вызывает главный конструктор родительского класса со строкой, которую получил на входе
        this.industriousness=10;
    }
    @Override
    public String getInfo() {
        return "units.Peasant";
    }
    @Override
    public void step(ArrayList<Character> team){
        Character nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), position.getDistance(nearestFoe.getCoordinates()));
    }
}
