package chapter3page95;

class Dog {
    String name, says;
}

public class Exercise5and6ch3 {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.name = "Spot";
        spot.says = "Gav-gav";

        scruffy.name = "Scraffy";
        scruffy.says = "Gav-Gav-gav";

        System.out.println("Speak name first dog: " + spot.name + "!");
        System.out.println("Answer first dog: " + spot.says);

        System.out.println("Speak name second dog: " + scruffy.name + "!");
        System.out.println("Answer second dog: " + scruffy.says);

        spot = scruffy;

        System.out.println(spot.says == scruffy.says);

        System.out.println(spot.says.equals(scruffy.says));
    }
}
