package arraylist2;
import java.util.*;

public class Extractelement {

	public static void main(String[] args)
	{
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		System.out.println("Original list="+list_String);
		List<String> sub_list=list_String.subList(0,2);
		System.out.println("After shuffle="+sub_list);
		
	}

}
