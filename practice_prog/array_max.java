package practice_java_home;
import java.util.*;
public class array_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//        double mark_avg;
//        int result;
        int i;
        int s;
     //define size of array
      s = input.nextInt();
    //The array is defined "arr" and inserted marks into it.
     int[] arr = new int[s];   
     for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
       }
     
     int max = arr[0];
     int avg = 0;
    
     for(i = 0 ; i<arr.length ; i++) {
    	 avg += (arr[i]);
    	 if(arr[i] > max) {
    		 max = arr[i];
    	 }
     }
     double final_avg = avg/(arr.length);
     System.out.println(max);
     System.out.printf("%.2f",final_avg);
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     input.close();
	}

}
