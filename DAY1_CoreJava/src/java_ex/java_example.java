package java_ex;
import java.util.Scanner;

public class java_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 int a,b,c,d;
 System.out.println("Enter values for a and b: ");
 a=s.nextInt();
 b=s.nextInt();
 
 c=a+b;
 d=a-b;
 System.out.println("Addition of a="+a+" and b="+b+" is ="+c);
 System.out.println("Subtraction of a="+a+" and b="+b+" is ="+d);
	}

}
