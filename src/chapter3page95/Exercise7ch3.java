package chapter3page95;

public class Exercise7ch3 {
    public static void main(String[] args) {

        int h = 0; //Решка
        int t = 0; //Орел
        for (int i = 0; i < 1000; i++) {
            int num = (int) (1000 * Math.random());
            if (num < 500) {
                h++;

            } else {
                t++;

            }
        }
        System.out.println("Igle: " + t);
        System.out.println("Reshka: " + h);
    }
}
