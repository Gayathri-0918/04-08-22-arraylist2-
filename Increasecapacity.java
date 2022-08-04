package arraylist2;
import java.util.*;

public class Increasecapacity {

	public static void main(String[] args)
	{
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        c1.ensureCapacity(10);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        c1.add("gayu");
        c1.add("ma");
       System.out.println("moderate list"+c1);
        
        
       
	}

}
