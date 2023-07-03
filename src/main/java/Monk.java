public class Monk extends Mages {//монах-персонаж, наследник класса Маги


    public Monk(String name) {
        super(name);
    }
    @Override
    public String getInfo() {
        return "Monk";
    }
    @Override
    public void step(){}
}