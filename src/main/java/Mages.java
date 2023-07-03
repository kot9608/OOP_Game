public abstract class Mages extends Character {//класс Маги, наследник класса персонаж
    public int manaSize;//размер маны
    public int manaMaxSize;//максимальный размер маны

    public Mages(String name) {
        super(name);
        this.manaSize=100;
        this.manaMaxSize=1000;
    }
}
