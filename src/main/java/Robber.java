public class Robber extends Infantrys{//класс разбойник, наследник класса пехота
    public int danger;//опасность

    public Robber(String name) {
        super(name);
        this.danger=10;
    }
    @Override
    public String getInfo() {
        return "Robber";
    }
    @Override
    public void step(){}
}
