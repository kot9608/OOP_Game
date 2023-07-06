package units;

public abstract class Shooters extends Character {//стрелки, наследник класса Персонаж
    public int powerShot;//сила выстрела

    public Shooters(String name, int x, int y) {
        super(name, 50, 100, 5, x, y);
        this.powerShot=5;
    }
}