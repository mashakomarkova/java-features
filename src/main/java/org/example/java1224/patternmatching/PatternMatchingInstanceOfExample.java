package org.example.java1224.patternmatching;

public class PatternMatchingInstanceOfExample {

    public static void main(String[] args) {
        instanceOfWithObjects();
    }

    public static void oldInstanceOfExample() {
        Object obj = "Hello, Java!";

        if (obj instanceof String) {
            String str = (String) obj;  // Manual cast required
            System.out.println(str.length());
        }
    }

    public static void newInstanceOf() {
        Object obj = "Hello, Java!";

        if (obj instanceof String str) {  // No need to cast explicitly
            System.out.println(str.length());  // Directly use str
        }
    }

    public static void instanceOfWithObjects() {
        Object obj = new Point(10, 20);

        if (obj instanceof Point p) {
            System.out.println("Coordinates: " + p.x() + ", " + p.y());
        }

        if (obj instanceof Point(int x, int y)) {
            System.out.println("Coordinates: " + x + ", " + y);
        }
    }

    public static void testPrimitive() {
        Object value = 42;

        if (value instanceof int i) {  // Pattern matching for int
            System.out.println("Integer detected: " + (i * 2));
        } else if (value instanceof double d) {  // Pattern matching for double
            System.out.println("Double detected: " + (d * 2));
        } else {
            System.out.println("Unknown type");
        }
    }

    record Point(int x, int y) {}

}
