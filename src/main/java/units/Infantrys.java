package units;

public abstract  class Infantrys extends Character {//класс пехота, наследник класса Персонаж
    public int endurance;//выносливость
    public Infantrys(String name, int x, int y){
        super(name, 100, 300, 50, x, y);
        this.endurance=10;
    }
}


