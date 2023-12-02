
public class MainMethodOverloading {
	public static void main(String[] args) {
		System.out.println("1");
		main();
		main(44);
		
	}

	public static void main() {
		System.out.println("2");
	}

	public static void main(int a) {
		System.out.println("3");
	}
}
