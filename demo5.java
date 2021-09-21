//Area of Circle

import java.util.*;
class demo5{
	public static void main(String args[]){
		System.out.println("Enter Radius of circle");
		Scanner scr =new Scanner(System.in);
		double x = scr.nextDouble();
		double area = 3.14 * x * x;
		System.out.println("Area is " + area + "cm2 .");
	}
}