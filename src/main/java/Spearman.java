public class Spearman extends Infantrys{//копейщик, наследник класса Пехота

    public Spearman(String name) {
        super(name);
    }
    @Override
    public String getInfo() {
        return "Spearman";
    }
    @Override
    public void step(){}
}

