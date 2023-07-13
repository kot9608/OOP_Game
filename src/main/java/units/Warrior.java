package units;

import java.util.ArrayList;

public abstract class Warrior extends Character implements CharacterInterface{
    int armor;
    public Warrior(Names name, int hp, int maxHp, int damage, int defense, int initiative, int speed, int armor, int x, int y) {
        super(name, hp, maxHp, damage, defense, initiative, speed, x, y);
        this.armor = armor;
    }
    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> team2){
        if (state.equals(States.DEAD)) return;
        Character nearestFoe = findNearest(team);
//    System.out.printf("%s in %d\n", nearestFoe.getInfo(), position.getDistance(nearestFoe.getCoordinates()));
    }
    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" arm: %d", this.armor);
    }
}