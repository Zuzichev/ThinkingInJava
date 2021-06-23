package chapter2page93;

//https://habr.com/ru/post/329498/ - autoboxing and unboxing!

public class Exercise9 {

    
    public static void main(String[] args) {
        Integer iOb1 = 100;
		Integer iOb2 = 100;
		System.out.println(iOb1 == iOb2);

		Integer iOb3 = new Integer(120);
		Integer iOb4 = new Integer(120);
		System.out.println(iOb3 == iOb4);

		Integer iOb5 = 200;
		Integer iOb6 = 200;
		System.out.println(iOb5 == iOb6);

    }
}