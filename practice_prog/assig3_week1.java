package practice_java_home;

import java.util.Scanner;

public class assig3_week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int sum =0;	
		
		int even =0;
        for(int i=0;i<=n;i++) {
            if(even%3==0) {
                sum=sum+even;
            }
            even=even +2;
        }
        System.out.print(""+sum);
	}

}
