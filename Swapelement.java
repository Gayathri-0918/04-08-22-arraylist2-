package arraylist2;
import java.util.*;

public class Swapelement {

	public static void main(String[] args) 
	{
		List<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Orange");
		c1.add("White");
		c1.add("Black");
		System.out.println("Befoe swap:");
		for(String a:c1)
		{
			System.out.println(a);
		}
		Collections.swap(c1, 0, 2);
		System.out.println("After swapping:");
		for(String b:c1)
		{
			System.out.println(b);
		}
		
	}

}
