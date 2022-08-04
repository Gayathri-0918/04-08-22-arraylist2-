package arraylist2;
import java.util.*;

public class Trimtosize {

	public static void main(String[] args) 
	{
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        c1.add("blue");
        System.out.println("List " + c1);
        c1.trimToSize();
        System.out.println("after trim to size:"+c1);
        
	}

}
