package pl.dicedev.game.Utils;

public class Strings {
    public static void println(String s) {
        System.out.println(s);
    }

    public static void print(String s) {
        System.out.print(s);
    }

    public static void println(String s, Color color) {
        System.out.println(color.colorCode + s);
        System.out.print(Color.BLACK.colorCode);
        System.out.print(Color.RESET.colorCode);
    }

    public static void print(String s, Color color) {
        System.out.print(color.colorCode + s);
        System.out.print(Color.RESET.colorCode);
    }

    public static void println(Object o, Color color) {
        System.out.println(color.colorCode + o);
        System.out.print(Color.RESET.colorCode);
    }

    public static void print(Object o, Color color) {
        System.out.print(color.colorCode + o);
        System.out.print(Color.RESET.colorCode);
    }

    public static void println(String s, Color color1, Color color2) {
        System.out.println(color1.colorCode + color2.colorCode + s);
        System.out.print(Color.BLACK.colorCode);
        System.out.print(Color.RESET.colorCode);
    }

    public static void print(String s, Color color1, Color color2) {
        System.out.print(color1.colorCode + color2.colorCode + s);
        System.out.print(Color.RESET.colorCode);
    }

    public static void println(Object o, Color color1, Color color2) {
        System.out.println(color1.colorCode + color2.colorCode + o);
        System.out.print(Color.RESET.colorCode);
    }

    public static void print(Object o, Color color1, Color color2) {
        System.out.print(color1.colorCode + color2.colorCode + o);
        System.out.print(Color.RESET.colorCode);
    }

    public enum Color {
        RESET("\033[0m"),
        BLACK("\u001B[30m"),
        RED("\u001B[31m"),
        GREEN("\u001B[32m"),
        YELLOW("\u001B[33m"),
        BLUE("\u001B[34m"),
        PURPLE("\u001B[35m"),
        CYAN("\u001B[36m"),
        WHITE("\u001B[37m"),
        RED_BACKGROUND("\u001B[41m"),
        GREEN_BACKGROUND("\u001B[42m"),
        YELLOW_BACKGROUND("\u001B[43m"),
        BLUE_BACKGROUND("\u001B[44m"),
        PURPLE_BACKGROUND("\u001B[45m"),
        CYAN_BACKGROUND("\u001B[46m"),
        BLACK_BACKGROUND("\u001B[40m"),
        WHITE_BACKGROUND("\u001B[47m"),
        ;

        private final String colorCode;

        Color(String s) {
            this.colorCode = s;
        }

    }
}
