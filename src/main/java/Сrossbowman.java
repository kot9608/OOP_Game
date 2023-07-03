public class Сrossbowman extends Shooters {//арбалетчик, наследник класса стрелки
    public int accuracy;//точность

    public Сrossbowman(String name) {
        super(name);
        this.accuracy=10;

    }
    @Override
    public String getInfo() {
        return "Сrossbowman";
    }
    @Override
    public void step(){}
}

