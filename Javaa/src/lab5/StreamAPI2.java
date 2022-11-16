package lab5;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
class Customerr{
	private int id;
	private String name;
	private String email;
	private String city;
	private int age;
	public Customerr(int id, String name, String email, String city, int age) {
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
public class StreamAPI2 {
	public static void getAllCustomers(ArrayList<Customerr> cusList) {
		cusList.stream().forEach(c->System.out.println(c));
	}
	
	public static void getCustomerById(ArrayList<Customerr> cusList, int id) {
		cusList.stream().filter(c->c.getId()==id).forEach(c->System.out.println(c));
	}
	
	public static void getCustomerByNameAndEmail(ArrayList<Customerr> cusList) {
		cusList.stream().filter(c->c.getName().equals("virtusa") &&c.getEmail().endsWith("gmail.com")).forEach(c->System.out.println(c));
	}
	
	public static int totalSumOfAge(ArrayList<Customerr> cusList) {
		int totalSum=cusList.stream().map(c->c.getAge()).reduce(0,(sum,age)->sum+age);
		return totalSum;
		
	}
	
	public static Map<Integer,Customerr> convertToMap(ArrayList<Customerr> cusList) {
		Map<Integer,Customerr> hash=cusList.stream().collect(Collectors.toMap(c->c.getId(),Function.identity()));
		return hash;
	}
	
	public static void sortByName(ArrayList<Customerr> cusList) {
		cusList.stream().sorted((c1,c2)->c1.getName().compareTo(c2.getName())).forEach(c->System.out.println(c));
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Customerr> arr=new ArrayList<Customerr>();
		Customerr c1=new Customerr(11, "darshan","darshan71@gmail.com","bangalore", 25);
		Customerr c2=new Customerr(12, "virtusa","ramya45@outlook.com","bangalore", 24);
		Customerr c3=new Customerr(13, "chethan","chrthan@gmail.com","chennai", 27);
		Customerr c4=new Customerr(14, "anil","anil@virtusa.com","chennai", 25);
		Customerr c5=new Customerr(15, "virtusa","ramya45@gmail.com","bangalore", 24);
		Customerr c6=new Customerr(16, "ramya","ramyavv@gmail.com","chennai", 27);
		
		arr.add(c1);
		arr.add(c2);
		arr.add(c3);
		arr.add(c4);
		arr.add(c5);
		arr.add(c6);
		
		getAllCustomers(arr);
		System.out.println();
		
		System.out.println("Enter id:");
		
		int id=sc.nextInt();
		getCustomerById(arr, id);
		
		System.out.println();
		System.out.println("Customer ..whose name is virtusa and has gmail.com domain are:");
		getCustomerByNameAndEmail(arr);
		
		System.out.println();
		System.out.println("Total sum of ages: "+totalSumOfAge(arr));
		
		System.out.println();
		sortByName(arr);
		
		
		
		System.out.println();
		System.out.println(convertToMap(arr));
	}

}
