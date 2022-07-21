package practice_java_home;
import java.util.Scanner;

public class VNumber1 {

	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter V Shape Number Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing the V Shape Number Pattern");
		
		for (int i = 1 ; i <= rows; i++ ) 
		{
			for (int j = 1 ; j <= i; j++ ) 
			{
				System.out.print(j);
			}
			for (int k = 1; k <= 2 * (rows - i); k++ ) 
			{
				System.out.print(" ");
			}
			for (int l = i; l >= 1; l-- ) 
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}