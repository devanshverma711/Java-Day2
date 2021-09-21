// i++ and ++i
public class demo7{
public static void main(String[] args){

	int i = 10; 
	int n = i++%2; 
	int m = ++i%7;
	System.out.println(i+m);
	System.out.println(i+n);
	System.out.println(++i);
	System.out.println(i++);
	}
}
