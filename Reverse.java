package guvi;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
	a=s.nextLine();
		StringBuffer b=new StringBuffer(a);
		System.out.println(b.reverse());
		
		

	}

}
