package Lab4;

import java.util.LinkedList;

class House{
	private int houseNumber;
	private String houseName;
	public House(int houseNumber, String houseName) {
		super();
		this.houseNumber = houseNumber;
		this.houseName = houseName;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	@Override
	public String toString() {
		return "House [houseNumber=" + houseNumber + ", houseName=" + houseName + "]";
	}
	
	
}

public class LinkedListEx {

	public static void main(String[] args) {
		House h1=new House(12, "krishna neelaya");
		House h2=new House(13, "raama neelaya");
		House h3=new House(14, "amma neelaya");
		House h4=new House(15, "vinayaka neelaya");
		House h5=new House(16, "vishnu neelaya");
		LinkedList<House> link=new LinkedList<House>();
		link.add(h1);
		link.add(h2);
		link.add(h3);
		link.add(h4);
		link.add(h5);
		
		 for(House houses: link){
			   System.out.println(houses);
			    }
		 System.out.println();
		 System.out.println("--------Getting first and last house------");
		 System.out.println("First:"+link.getFirst());
		 System.out.println("Last:"+link.getLast());
		 
		 
		 System.out.println();
		 System.out.println("--------Removing last house------");
		 System.out.println(link.removeLast());
		 
		 
		 System.out.println();
		 System.out.println("--------adding house between 3rd and 4th ------");
		 link.add(3,h5);
		 for(House houses: link){
			   System.out.println(houses);
			    }


	}

}
