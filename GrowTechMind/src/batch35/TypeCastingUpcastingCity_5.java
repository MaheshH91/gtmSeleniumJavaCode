package batch35;

class TypeCastingUpcastingCountry {
	void countrymethod1() {
		System.out.println("1");
	}
}

class TypeCastingUpcastingState extends TypeCastingUpcastingCountry {
	void statemethod1() {
		System.out.println("2");
	}
}

public class TypeCastingUpcastingCity_5 extends TypeCastingUpcastingState {
	void city() {
		System.out.println("3");
	}

	public static void main(String[] args) {
		TypeCastingUpcastingCountry ref=new TypeCastingUpcastingState();
		ref.countrymethod1();
		
	}

}
