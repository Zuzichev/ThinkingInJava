package chapter4page130;

public class Exercise2ch4 {
    public static void main(String[] args) {
        int itest = (int)(100*Math.random());
        for(int i=1; i<26; i++){
            int icircle = (int)(100*Math.random());
            if (itest>icircle)
                System.out.println(itest + " biggest then " + icircle);
            else if (itest<icircle)
                System.out.println(itest + " smalest then " + icircle);
            else
                System.out.println(itest + " equlet " + icircle);
        }
    }
}
