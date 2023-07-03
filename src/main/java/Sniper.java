public class Sniper extends Shooters { //снайпер, наследник класса стрелки
    public int accuracy;//точность

    public Sniper(String name) {
        super(name);
        this.accuracy=15;
    }
    @Override
    public String getInfo() {
        return "Sniper";
    }
    @Override
    public void step(){}
}



