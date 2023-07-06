package units;

//1. Создать класс с описанием координат, x и y.
//2. Добавить в абстрактный класс поле с координатами и пробросить его
//инициализацию до конструкторов персонажей.
// Farmer farmer = new Farmer(getName(), x, y);
public class Coordinates {
    private int x;
    private int y;
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int[] getPosition(){
        return new int[]{x,y};
    }

    @Override
    public String toString(){
        return String.format("%d, %d", x, y);
    }

    public int getDistance(Coordinates targetPosition) {
        return (int) Math.sqrt(Math.pow(x - targetPosition.getPosition()[0], 2) + Math.pow(y - targetPosition.getPosition()[1], 2));
    }
}