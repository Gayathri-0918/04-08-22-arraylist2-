package arraylist2;

import java.util.*;

public class Reverseelement {

	public static void main(String[] args) 
	{
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		System.out.println("Before reverse="+list_String);
		Collections.reverse(list_String);
		System.out.println("After reverse="+list_String);
		

	}

}
