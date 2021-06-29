package chapter3page95;

public class Exercise10ch3 {
    public static void main(String[] args) {
        byte dt1 = 0b1010101;
        byte dt2 = 0b0101010;

        System.out.println(Integer.toBinaryString(dt1^dt2));
        System.out.println(Integer.toBinaryString(dt1&dt2));
        System.out.println(Integer.toBinaryString(dt1|dt2));
    }
}
