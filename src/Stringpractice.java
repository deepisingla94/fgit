import java.sql.SQLOutput;

public class Stringpractice {
    public static void main(String[] args) {
        String name = "          Deepika is studying and is playing      ";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(3));
        System.out.println(name.replace('e','u'));
        System.out.println(name.startsWith("e"));
        System.out.println(name.startsWith("de"));
        System.out.println(name.startsWith("De"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.charAt(5));
        System.out.println(name.equals("Deepika"));
        System.out.println(name.equals("deePika"));
        System.out.println(name.equalsIgnoreCase("deePIka"));
        System.out.println(name.indexOf("pi"));
        System.out.println(name.trim());

    }
}
