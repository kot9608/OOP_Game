public class Peasant extends Infantrys  {//класс крестьянин, наследник класса пехота
    public int industriousness;//трудолюбие(коэфицент увеличения силы)
    public Peasant(String name){//конструктор для создания крестьянина, принимает на вход строку стринг
        super(name);//вызывает главный конструктор родительского класса со строкой, которую получил на входе
        this.industriousness=10;
    }
}
