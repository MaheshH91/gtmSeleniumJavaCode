package batch35;

public class ThisKEyWord_Program {
	int age;
	String name;
	double salary;

	void employeeDetails(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		System.out.println("My Details");

	}

	public static void main(String[] args) {
		ThisKEyWord_Program t1 = new ThisKEyWord_Program();
		t1.employeeDetails(10, "Mahesh Holkar", 100000.34);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
		
		ThisKEyWord_Program t2 = new ThisKEyWord_Program();
		t2.employeeDetails(34, "Seeta", 134230.34);
		System.out.println(t2.age);
		System.out.println(t2.name);
		System.out.println(t2.salary);
	}
}
