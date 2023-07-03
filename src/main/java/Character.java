public abstract class Character implements CharacterInterface {//абстрактный класс, используется без методов(поведения). Служит для обобщения какой-то группы классов по общим параметрам //нельзя создавать экземпляры абстрактного класса
    public String name;//имя персонажа
    public int hp;//очки здоровья
    public int maxHp;//максимальное количество очков здоровья
    public int defense;//защита
    public Character(String name){
        this.name=name;
        this.hp=70;
        this.maxHp=100;
        this.defense=10;
    }

    public String myTypeIs(){
        return "Personage";
    }


}


