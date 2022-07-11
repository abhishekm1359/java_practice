package practice_java_home;

public class Swapping {
	
	public void with_third_var() {
		int a = 10;
		int b = 25;
		int c = 0;
		
		System.out.println("Swapping with Third Variable");
		c= a;
		a =b;
		b=c;
		System.out.println("a is : " +a);
		System.out.println("b is : " +b);
	}
	
	public void without_third_var() {
		int x = 20;
		int y = 35;
		
		System.out.println("\n\nSwapping without using Third Variable");
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("x is : " +x);
		System.out.println("y is : " +y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapping s = new Swapping();
		s.with_third_var();
		s.without_third_var();
	}

}
