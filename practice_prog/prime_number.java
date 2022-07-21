package practice_java_home;
import java.util.*;

public class prime_number {
	
	
	static void checkPrime() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to check for prime : ");
		int x = s.nextInt();
		
		if(x==1 || x==0)
			System.out.print(x+" is not prime number");
		int counter = 1;
		for(int i=2 ; i<x ; i++) {
			if(x%i == 0)
				counter += 1;			
		}
		
		if(counter == 2)
			System.out.println(x+" is not a prime number");
		else
			System.out.println(x+" is a prime number");
	}
	
	static void rangePrime() {
		Scanner s = new Scanner(System.in);
		System.out.println("\n\nRange of prime numbers");
		System.out.print("Enter the first number range : ");
		int x = s.nextInt();
		System.out.print("Enter the second number range : ");
		int y = s.nextInt();
		
		int i,j;
		int count = 0;
		
		for(i=x; i<=y; i++) {
			for(j=2; j<=i; j++) {
				if(i%j == 0)
					break;
			}
			if(i == j) {
				int primenumber = i;
				System.out.print("Prime Numbers are = ");
				System.out.println(primenumber);
				count++;
			}
		}
		System.out.println("Total count of prime number is : " + count);
		
	}	
		
	
	
	
	
	public static void main(String[] args) {
		checkPrime();
		rangePrime();
		
	}
}
