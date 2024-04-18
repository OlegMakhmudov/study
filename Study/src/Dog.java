import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog max = new Dog("Макс");
        max.woof();
        max.run(20);
        System.out.println(Charset.defaultCharset());
        String text = "A23E-8M28-76AF-2L65-24A3";
        String regex = "[A-F0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        matcher.find();
        matcher.find();
        System.out.println(matcher.group());
        System.out.println(Math.round(2.5));
    }

    public void woof() {
        System.out.println("Собака по имени " + name + " говорит \"Гав-гав!\"");
    }

    public void run(int meters) {
        System.out.println("Собака по имени " + name + " пробежала " + meters + " метров!");
    }

    public String getName() {
        return name;
    }
}
