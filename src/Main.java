import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static String name = "udenfor";

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String greeting = "Hej Verden!";
        String name = "Christian";
        String besked = "og jeg synes programmering er for sindsygt fedt!";
        int age = 32;

        System.out.println(args[2]);

        String[] test = new String[9];
        test[1] = "0";

        System.out.println(getName());

        System.out.printf("%s, jeg hedder %s, jeg er %d år gammel.%n%s", greeting, name, age, besked);

        Rectangle firkant = new Rectangle(5, 10, 20, 30);
        System.out.println(firkant);

    }

    public static String getName() {
        return name;
    }

    void metodeName() {

    }
}
