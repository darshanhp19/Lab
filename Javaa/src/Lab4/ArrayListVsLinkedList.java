package Lab4;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList();
		LinkedList<Integer> linkedList=new LinkedList();
		int value=9000000;
		
		 for (int i = 0; i <= value; i++) {
			 arrayList.add(i);
			 linkedList.add(i);
		    }
		 
		 long d1 = System.currentTimeMillis();
		 linkedList.add(23,343);
		 arrayList.add(122,343);
		 arrayList.add(455,3436);
		 arrayList.remove(343);
		 arrayList.add(235,7343);
		 arrayList.add(192,343);
		 arrayList.add(415,3436);
		 arrayList.remove(488);
		 long d2 = System.currentTimeMillis();
		    System.out.println("Time Taken in ArrayList:  " + (d2 - d1));
		    
		    
		    System.out.println("--------------------------");
		    
		    long d3 = System.currentTimeMillis();
		    linkedList.add(23,343);
		    linkedList.add(122,343);
		    linkedList.add(455,3436);
		    linkedList.remove(343);
		    linkedList.add(235,7343);
		    linkedList.add(192,343);
		    linkedList.add(415,3436);
		    linkedList.remove(488);
			 long d4 = System.currentTimeMillis();
			    System.out.println("Time Taken in LinkedList:  " + (d4 - d3));
			 
		 
		
	}

}
