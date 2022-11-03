package lab3;

public final class Employee {
	
	private final String name;
	private final double salary;
	private final String address;
	
	public Employee(String name, double salary, String address) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("darshan", 25875.89, "Bangalore");
		System.out.println(employee.name);
		System.out.println(employee.salary);
		System.out.println(employee.address);
		
		

	}

}
