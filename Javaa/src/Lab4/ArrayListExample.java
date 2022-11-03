package Lab4;

import java.util.ArrayList;
import java.util.Collections;

class Customerr implements Comparable<Customerr>{
	
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String address;
	private char gender;
	
	public Customerr(String firstName, String lastName, int age, String email, String address,char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.address = address;
		this.gender=gender;
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
	
	

	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		
		return " "+firstName+" "+age+" "+address+" "+gender;
	}


	public int compareTo(Customerr c) {
		return this.firstName.compareTo(c.firstName);
	}
	
}

public class ArrayListExample {

	public static void main(String[] args) {
		Customerr c1=new Customerr("darshan","gowda", 24,"darshanhp71@gmail.com", "Bangalore",'M');
		Customerr c2=new Customerr("chethan","shetty", 28,"chethan87@gmail.com", "Chennai",'M');
		Customerr c3=new Customerr("zyan","malik", 24,"zyaaaan@gmail.com", "Bangalore",'M');
		Customerr c4=new Customerr("abhi","shetty", 28,"abhiii@gmail.com", "Hyderabad",'M');
		Customerr c5=new Customerr("ramya","gowda", 28,"ramyavven@gmail.com", "Pune",'F');
		
		 ArrayList<Customerr> arraylist = new ArrayList<Customerr>();
		 arraylist.add(c1);
		 arraylist.add(c2);
		 arraylist.add(c3);
		 arraylist.add(c4);
		 arraylist.add(c5);
		 
		 for(Customerr str: arraylist){
			   System.out.println(str);
			    }
		 
		 System.out.println();
		 System.out.println("--------After sorting--------");
		 Collections.sort(arraylist);

		    for(Customerr str: arraylist){
		   System.out.println(str);
		    }
		    
		    System.out.println();
		    
		    System.out.println("---------Appending Mr and Mrs-----------");
		    
		    for(Customerr str: arraylist){
				  if(str.getGender()=='M') {
					  System.out.println("Mr."+str.getFirstName());
				  }else {
					  System.out.println("Mrs."+str.getFirstName());
				  }
				    }
		    
		    
	}

}
