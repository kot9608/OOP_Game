public class Shooters extends Character {//стрелки, наследник класса Персонаж
    public int powerShot;//сила выстрела

    public Shooters(String name) {
        super(name);
        this.powerShot=5;
    }
}