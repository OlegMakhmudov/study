package Patterns.StrategyExample1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ChristmasDiscounter christmasDiscounter = new ChristmasDiscounter();
        System.out.println(christmasDiscounter.applyDiscount(BigDecimal.valueOf(100)));

        EasterDiscounter easterDiscounter = new EasterDiscounter();
        System.out.println(easterDiscounter.applyDiscount(BigDecimal.valueOf(100)));

    }
}
