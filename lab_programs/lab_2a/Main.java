package lab_2bb;
import lab_2b.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        while(true){
	            System.out.println("Enter 1 to find the area of the square");
	            System.out.println("Enter 2 to find the area of the triangle");
	            System.out.println("Enter 3 to find the area of the circle");
	            System.out.println("Enter 4 to exit");
	            System.out.println("Enter your choice");
	            int ch = sc.nextInt();
	            if (ch==1) {
	                System.out.println("Enter the size of the sides");
	                double s = sc.nextDouble();
	                Square sq = new Square();
	                System.out.println("The area of the square is " + sq.area(s));
	            }
	            else if(ch==2) {
	                System.out.println("Enter the base of the triangle");
	                double b = sc.nextDouble();
	                System.out.println("Enter the height of the triangle");
	                double h = sc.nextDouble();
	                Triangle tr = new Triangle();
	                System.out.println("The area of the triangle is " + tr.area(h, b));
	            }
	            else if(ch==3) {
	                System.out.println("Enter the radius of the circle");
	                double r = sc.nextDouble();
	                Circle cr = new Circle();
	                System.out.println("The area of the circle is " + cr.area(r));
	            }
	            else if(ch==4) {
	                break;
	            }
	            else {
	                System.out.println("Wrong value input try again");
	            }
	        }sc.close();
	    }
	}
