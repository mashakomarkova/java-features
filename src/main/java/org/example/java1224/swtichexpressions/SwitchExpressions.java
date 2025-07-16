package org.example.java1224.swtichexpressions;

public class SwitchExpressions {

    public static void main(String[] args) {
        String day = "MONDAY";

        switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> System.out.println(6);
            case "TUESDAY" ->  System.out.println(7);
            default ->  System.out.println(0);
        };
        traditionalSwitch();
       // System.out.println("Number of letters: " + numLetters);
    }

    public static void traditionalSwitch() {
        String day = "MONDAY";

        int numLetters = switch (day) {
            case "MONDAY":
            case "FRIDAY":
            case "SUNDAY":
                yield 6;
            case "TUESDAY":
                yield 7;
            default:
                yield 0;
        };

        System.out.println("Number of letters: " + numLetters);
    }

    private static void switchWithYield() {
        String day = "WEDNESDAY";

        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> {
                System.out.println("This is Tuesday");
                yield 7;
            }
            default -> {
                System.out.println("Calculating...");
                yield day.length();  // Explicitly return value
            }
        };

        System.out.println("Number of letters: " + numLetters);
    }
}
