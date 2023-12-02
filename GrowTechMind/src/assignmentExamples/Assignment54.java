package assignmentExamples;

class State
{
	void highway()
	{
		System.out.println("State Highway");
	}
}
class City extends State
{
	void railway()
	{
		System.out.println("City Railway");
	}
}
public class Assignment54 extends City{
	void Airway()
	{
		System.out.println("Assignment54 Airway");
	}
	public static void main(String[] args) {
		City c1	= new Assignment54();
		c1.railway();
		c1.highway();
		Assignment54 a1 = (Assignment54) c1;
		a1.Airway();
		a1.highway();
		a1.railway();
		
	}

}
