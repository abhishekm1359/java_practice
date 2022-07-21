package practice_java_home;
import java.util.*;
public class armstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int remainder;
		
		int original = n;
		while(original != 0) {
			remainder = original%10;
			System.out.println(remainder);
			result += Math.pow(remainder, 3);
			original /= 10;
		}
		
		if(result == n) {
			result = 1;
			System.out.println(""+result);
		}else {
			result = 0;
			System.out.println(""+result);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
