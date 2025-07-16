package org.example.java1224.patternmatching;

public class SwitchPatternMatching {

    public static void main(String[] args) {
        example();
    }

    public static void oldSwitch() {
        Object obj = 42;

        switch (obj.getClass().getSimpleName()) {
            case "String":
                System.out.println("String length: " + ((String) obj).length());
                break;
            case "Integer":
                System.out.println("Integer value: " + ((Integer) obj) * 2);
                break;
            default:
                System.out.println("Unknown type");
        }
    }

    public static void newSwitchExample() {
        Object obj = 42;

        switch (obj) {
            case String s -> System.out.println("String " + s);
            case Integer i -> System.out.println("Integer value: " + i * 2);
            default -> System.out.println("Unknown type");
        }
    }

    public static void switchWithPrimitives() {
        Object value = 3.14;

        switch (value) {
            case int i -> System.out.println("Integer: " + (i * 2));
            case double d -> System.out.println("Double: " + (d * 2));
            case boolean b -> System.out.println("Boolean: " + !b);
            default -> System.out.println("Unknown type");
        }
    }

    public static void example() {
        Object record = new Point(1,2);

        switch (record) {
            case Integer i when i % 2 == 0-> System.out.println("Number is even " + i);
            case Integer i when i % 2 != 0-> System.out.println("Number is odd " + i);
            case Point(int x, int y) when x > 0 && y > 1 -> System.out.println("Coordinate x=" + x + " Coordinate y=" + y);
            case Point(int x, int y) when x < 0 && y > 1 -> System.out.println("Coordinate x=" + x + " Coordinate y=" + y);
            default -> System.out.println("Not an integer");
        }
    }

    record Point(int x, int y) {

    }
}
