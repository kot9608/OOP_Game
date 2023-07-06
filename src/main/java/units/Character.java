package units;

import java.util.ArrayList;

public abstract class Character implements CharacterInterface {//абстрактный класс, используется без методов(поведения). Служит для обобщения какой-то группы классов по общим параметрам //нельзя создавать экземпляры абстрактного класса
    protected String name;//имя персонажа
    protected int hp;//очки здоровья
    protected int maxHp;//максимальное количество очков здоровья
    protected int defense;//защита
    protected Coordinates position;


    public Character(String name, int hp, int maxHp, int defense, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.defense = defense;
        this.position = new Coordinates(x,y);
    }

    public String myTypeIs(){
        return "Personage";
    }

    public Coordinates getCoordinates() {
        return position;
    }

    protected Character findNearest(ArrayList<Character> team) {
        Character nearest = team.get(0);
        for (Character character : team) {
            if (position.getDistance(character.getCoordinates()) < position.getDistance(nearest.getCoordinates())) {
                nearest = character;
            }
        }
        return nearest;
    }


}


