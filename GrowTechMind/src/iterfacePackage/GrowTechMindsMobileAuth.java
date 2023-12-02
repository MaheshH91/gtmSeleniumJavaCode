package iterfacePackage;

interface GoogleAuth {
	void run();
}

public class GrowTechMindsMobileAuth implements GoogleAuth {

	public static void main(String[] args) {
		GrowTechMindsMobileAuth obj = new GrowTechMindsMobileAuth();
		obj.run();
	}

	@Override
	public void run() {
		System.out.println("we can the keep logic here");
	}

}
