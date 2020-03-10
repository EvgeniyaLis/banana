package fruits.impl;

public class Apple extends Banana {

    public Apple(boolean hasLeaves, String color) {
        super(hasLeaves, color);
    }

    @Override
    public boolean isYellow(int age) {
        return false;
    }
}
