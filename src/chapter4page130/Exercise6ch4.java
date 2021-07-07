package chapter4page130;

public class Exercise6ch4 {
    static int test(int testval, int target, int begin, int end){
        String x = "no range";
        if((testval>=begin & testval<=end)&&(testval > target))
            return +1;
        else if((testval>=begin & testval<=end)&&(testval < target))
                return -1;
        else if((testval>=begin & testval<=end)&&(testval == target))
                return 0;
        else System.out.println(x);
        return testval;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 2, 20));
        System.out.println(test(5, 10, 2, 20));
        System.out.println(test(5, 5, 2, 20));
        System.out.println(test(5, 5, 2, 3));
    }
}
