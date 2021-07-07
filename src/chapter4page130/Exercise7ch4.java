package chapter4page130;

public class Exercise7ch4 {
    public static void main(String[] args) {
        for (int i = 0; i<100; i++){
            if(i == 99) break;
            if(i%9 != 0) continue;
            System.out.print(i + "  ");
        }
        System.out.println();
        int f[] = new int[100];
        for(int j = 0; j<100; j++){
            f[j] = j;
        }
        for(int i:f){
            if(i == 99) break;
            if(i%9 != 0) continue;
            System.out.print(i + "  ");
        }
        System.out.println();
        int i = 0;
        while (true){
            i++;
            int j = i*27;
            if(j == 1269) break;
            if(i%10 != 0) continue;
            System.out.print(i + "  ");
        }
    }
}
