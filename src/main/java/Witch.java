public class Witch extends Mages{//колдун, наследник класса Маги


    public Witch(String name) {
        super(name);
    }
    @Override
    public String getInfo() {
        return "Witch";
    }
    @Override
    public void step(){}
}

