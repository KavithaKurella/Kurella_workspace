package my;
import java.util.*;

public class Whilech {
	public static void main(String args[]){
		String ch="yes";
		
		while(ch.equals("yes"))
		{
			System.out.println("Enter a value:");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextLine();
		}
	}

}
