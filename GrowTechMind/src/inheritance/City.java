package inheritance;

class Country {
	static void NH() {
		System.out.println("National highway");
	}
}

class State extends Country {
	static void Satate_HW() {
		System.out.println("State highway");
	}
}

public class City extends State {

	static void City_Hw() {
		System.out.println("City roads Highways");
	}

	public static void main(String[] args) {
		City city = new City();
		city.NH();
		city.Satate_HW();
		city.City_Hw();
	}

}
