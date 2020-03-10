package fruits;

public abstract class Fruit{

    public boolean hasLeaves;
    public String color;

    public Fruit(boolean hasLeaves, String color) {

    }

    public abstract boolean isYellow(int age);

    public void eat() {

    }
}
