import java.awt.Rectangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String greeting = "Hej Verden!";
        String name = "Christian";
        String besked = "og jeg synes programmering er for sindsygt fedt!";
        int age = 32;

        System.out.printf("%s, jeg hedder %s, jeg er %d år gammel.%n%s", greeting, name, age, besked);

        Rectangle firkant = new Rectangle(5, 10, 20, 30);
        System.out.println(firkant);

    }
}
