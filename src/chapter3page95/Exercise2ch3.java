



public class Exercise2ch3 {
	public static void main(String[] args) {
		class Tank {
	float calibr;
}
		
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		
		t1.calibr = 1.19e-10f;
		t2.calibr = 1.39e-10f;
		
		System.out.println("1: t1.calibr: " + t1.calibr + ", t2.calibr: " + t2.calibr);
		
		t1 = t2;
		System.out.println("1: t1.calibr: " + t1.calibr + ", t2.calibr: " + t2.calibr);
		
		t1.calibr = 1.11e-10f;
		System.out.println("1: t1.calibr: " + t1.calibr + ", t2.calibr: " + t2.calibr);
	}
}