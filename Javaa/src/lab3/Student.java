package lab3;

public class Student {
	public String name;
	public int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	 public void display(){
	      System.out.println("Name: "+this.name);
	      System.out.println("Age: "+this.age);
	     
	   }

	public static void main(String[] args) {
		Student arr[]=new Student[5];
		arr[0]=new Student("darshan", 24);
		arr[1]=new Student("anil", 28);
		try {
		for(int i = 0; i<arr.length; i++) {
	         arr[i].display();
	         System.out.println(" ");
	      }
		}catch(NullPointerException ne) {
			System.out.println("Nullpointer exception caught");
			ne.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
