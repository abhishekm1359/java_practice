package practice_java_home;
import java.util.*;

public class airthmetic_operations {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first integer :");
		int a = s.nextInt();
		System.out.print("Enter second integer :");
		int b = s.nextInt();
		System.out.print("Enter the operator :");
		String o = s.next();
		
		switch(o) {
		case "+":
			System.out.print(a + b);
			break;
		
		case "-":
			System.out.print(a - b);
			break;
		
		case "*":
			System.out.print(a * b);
			break;
		case "/":
			System.out.printf("a is %d b is %d\n",a,b);
			System.out.print((float)a/b);//explicit type casting.
			break;
		}
	}
}
