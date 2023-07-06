package units;

public abstract class Mages extends Character {//класс Маги, наследник класса персонаж
    protected int manaSize;//размер маны
    protected int manaMaxSize;//максимальный размер маны

    public Mages(String name, int x, int y) {
        super(name, 70, 150, 30, x, y);
        this.manaSize=100;
        this.manaMaxSize=1000;
    }
}
