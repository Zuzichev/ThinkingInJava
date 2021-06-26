package chapter3page95;

class Letter {
    float c;
}
public class Exercise3ch3 {
    static void f (Letter y) {
        y.c = 1.1e-10f;
    }

    public static void main(String[] args) {

    Letter x = new Letter();
        x.c = 1.2e-10f;
    System.out.println("1: x.c: " + x.c);
    f(x);
    System.out.println("2: x.c: " + x.c);
    }
}
