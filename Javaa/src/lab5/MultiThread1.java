package lab5;

import java.util.ArrayList;

class Customer{
	private int id;
	private String name;
	private String email;
	private String city;
	private int age;
	public Customer(int id, String name, String email, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", age=" + age + "]";
	}
	
	
}

public class MultiThread1 {

	public static void main(String[] args) {
		ArrayList<Customer> arr=new ArrayList<Customer>();
		Customer c1=new Customer(11, "darshan","darshan71@gmail.com","bangalore", 25);
		Customer c2=new Customer(12, "ramya","ramya45@gmail.com","bangalore", 24);
		Customer c3=new Customer(13, "chethan","darshan71@gmail.com","chennai", 27);
		
		arr.add(c1);
		arr.add(c2);
		arr.add(c3);
		
		Thread t1=new Thread() {
			public void run() {
				arr.stream().filter(c->c.getAge()%2==0).forEach(c->System.out.println("Even Age  "+c));
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				arr.stream().filter(c->c.getCity().equals("chennai")).forEach(c->System.out.println("Chennai city  "+c));
			}
		};
		
		Thread t3=new Thread() {
			public void run() {
				for(Customer z:arr) {
					System.out.println(z.getEmail());
				}
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
		

