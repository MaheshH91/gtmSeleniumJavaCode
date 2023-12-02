package inheritance;

class IND_Country {
	void NH_Highway() {
		System.out.println("NH Highway");
	}

	void CT_hospital() {
		System.out.println("CT Hospital");
	}
}

public class KA_State extends IND_Country {
	static void statehighway() {
		System.out.println("KA State highway");
	}

	public static void main(String[] args) {

		statehighway();
		KA_State k1 = new KA_State();
		k1.NH_Highway();
		k1.CT_hospital();

	}

}
