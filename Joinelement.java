package arraylist2;
import java.util.*;

public class Joinelement {

	public static void main(String[] args) 
	{
		List<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Orange");
		c1.add("White");
		c1.add("Black");
		System.out.println("list 1:"+c1);
		List<String> c2=new ArrayList<String>();
		c2.add("1");
		c2.add("2");
		c2.add("3");
		c2.add("4");
		c2.add("5");
		System.out.println("List 2:"+c2);
		List<String> c3=new ArrayList<String>();
		c3.addAll(c1);
		c3.addAll(c2);
		System.out.println("New list:"+c3);

	}

}
