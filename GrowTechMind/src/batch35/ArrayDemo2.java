package batch35;

public class ArrayDemo2 {

	public static void main(String[] args) {

		String names[] = new String[4];
		names[0] = "Ram";
		names[1] = "Sita";
		names[2] = "Vishnu";
		names[3] = "Laxman";
//		System.out.println(names[3]);
	
		
		int age[]= new int[4];
		age[0]=51;
		age[1]=39;
		age[2]=42;
		age[3]=76;
		
		for(int i=0;i<=3;i++) {
			System.out.println(names[i]+"   "+age[i+1]);
		}
		}
	
}
