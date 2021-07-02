package chapter4page130;

public class Exercise4ch4 {
    public static void main(String[] args) {
        for (int i=1; i<100; i++){
            int k=0;
            for (int j=1; j<=i; j++) {
                if ((i % j) == 0)
                    k++;
            }
            if (k<3)
                System.out.println("Simple number: " + i);
        }
    }
}
