package Lab4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


class Customer{
	private String firstName;
	 private String lastName;
	 private int age;
	 private String email;

	private String address;
	
	
	public Customer(String firstName, String lastName, int age, String email, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	

	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}


	public String getEmail() {
		return email;
	}


	public String getAddress() {
		return address;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		
		return " "+firstName+" "+age+" "+address;
	}

}
class SortByName implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
}

public class HashmapExample {

	public static void main(String[] args) {
		Customer c1=new Customer("darshan","gowda", 24,"darshanhp71@gmail.com", "Bangalore");
		Customer c2=new Customer("chethan","shetty", 28,"chethan87@gmail.com", "Chennai");
		Customer c3=new Customer("zyan","malik", 24,"zyaaaan@gmail.com", "Bangalore");
		Customer c4=new Customer("abhi","shetty", 28,"abhiii@gmail.com", "Hyderabad");
		Customer c5=new Customer("ramya","gowda", 28,"ramyavven@gmail.com", "Pune");
		SortByName firstN=new SortByName();
		HashMap<String,Customer> hm=new HashMap<>();
		hm.put(c1.getEmail(), c1);
		hm.put(c2.getEmail(), c2);
		hm.put(c3.getEmail(), c3);
		hm.put(c4.getEmail(), c4);
		hm.put(c5.getEmail(), c5);
		
		
		 System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : hm.entrySet()){    
		    System.out.println("key= "+m.getKey()+"   "+"value= "+m.getValue());    
		   }  
		   
		   System.out.println();
		   System.out.println("After sorting..............");
		  
		   TreeSet<Customer> t=new TreeSet<Customer>(firstN);
		   t.add(c1);
		   t.add(c2);
		   t.add(c3);
		   t.add(c4);
		   t.add(c5);

		   for(Customer cus:t) {
			   System.out.println(cus);
		   }
		   
		   System.out.println("Storing elements in TreeMap");
		   TreeMap<String, Customer> treemap=new TreeMap<String, Customer>();
		   treemap.put(c1.getEmail(), c1);
		   treemap.put(c2.getEmail(), c2);
		   treemap.put(c3.getEmail(), c3);
		   treemap.put(c4.getEmail(), c4);
		   treemap.put(c5.getEmail(), c5);
		   
		   
		   
		   for(Customer cus:t) {
			   System.out.println(cus);
		   }
		   
		  
		   
	}
	
	
}
