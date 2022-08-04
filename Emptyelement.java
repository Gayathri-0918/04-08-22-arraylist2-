package arraylist2;
import java.util.*;

public class Emptyelement {

	public static void main(String[] args)
	{
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        c1.add("blue");
        System.out.println("list " + c1);
        c1.removeAll(c1);
        System.out.println("Remove element list" +c1);       

	}

}
