package batch35;

class Teacher{
	Teacher(int a){
		System.out.println("teacher constructor");
	}
}
class Mentor extends Teacher{
	 Mentor(){
		 super(199);
		 System.out.println("mentor constructor");
	 }
}


public class StudentClassSuper extends Mentor{
	
	StudentClassSuper(){
		super();
		System.out.println("Student Constructor");
		
	}
	
	public static void main(String[] args) {

		new StudentClassSuper();
		
	}

}
