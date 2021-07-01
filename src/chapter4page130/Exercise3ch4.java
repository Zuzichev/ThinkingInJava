package chapter4page130;

public class Exercise3ch4 {
    static boolean pressQ() {
        boolean result = Math.random() < 0.99;
        return result;
    }


    public static void main(String[] args) {

        int itest = (int) (100 * Math.random());

        while (pressQ()){

            int icircle = (int) (100 * Math.random());
            if (itest > icircle)
                System.out.println(itest + " biggest then " + icircle);
            else if (itest < icircle)
                System.out.println(itest + " smalest then " + icircle);
            else
                System.out.println(itest + " equlet " + icircle);
            }
    }
}
