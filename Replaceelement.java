package arraylist2;

import java.util.*;

public class Replaceelement {

	public static void main(String[] args) 
	{
		ArrayList<String> colour=new ArrayList<String>();
		colour.add("red");
		colour.add("blue");
		System.out.println("original list"+colour);
		String new_colour="white";
		colour.set(1, new_colour);
		System.out.println("new list"+colour);

	}

}
