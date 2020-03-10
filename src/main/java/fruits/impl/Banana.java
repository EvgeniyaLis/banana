package fruits.impl;

import fruits.Fruit;

public class Banana extends Fruit {

    public Banana(boolean hasLeaves, String color) {
        super(hasLeaves, color);
    }

    // модификатор доступа: public, private, protected, package-private
    // тип возвращаемого значения: void - nothing, int, String
    public void peel() {

    }

    public boolean isYellow(int age) {
        if (age < 2) {
            return true;
        }
        return false;
    }

    public static String getHello() {
        return "Hello";
    }
}

