// Calculate interest
import java.io.*;
 class demo6{
	public static void main(String args[]){
		float principalamount;
		float rateofinterest ;
		int numberofyears = 0;
		try{
		DataInputStream in = new DataInputStream(System.in);
		String tempString;
		System.out.println("Enter principalamount: ");
		System.out.flush();
		tempString = in.readLine();
		principalamount = Float.valueOf(tempString);
		
		System.out.println("Enter rateofinterest: ");
		System.out.flush();
		tempString = in.readLine();
		rateofinterest = Float.valueOf(tempString);
		
		System.out.println("Enter numberofyears: ");
		System.out.flush();
		tempString = in.readLine();
		numberofyears = Integer.parseInt(tempString);
		
		float interestTotal = principalamount * rateofinterest * numberofyears;
		System.out.println("Simple Interest is " + interestTotal) ;
		}
		catch (Exception ex){
		}
	}
}