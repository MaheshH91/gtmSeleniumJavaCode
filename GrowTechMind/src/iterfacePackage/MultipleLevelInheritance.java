package iterfacePackage;

interface GoogleAuth1 {
	void gUn();

	void gPws();
}

interface FaceBookAuth {

	void fbUn();

	void fbPwd();

}

public class MultipleLevelInheritance implements GoogleAuth1, FaceBookAuth {

	@Override
	public void fbUn() {
		System.out.println("Fb Username method implementation");

	}

	@Override
	public void fbPwd() {

		System.out.println("fb pwd methods implementation");
	}

	@Override
	public void gUn() {
		System.out.println("google Username method implementation");

	}

	@Override
	public void gPws() {
		System.out.println("google pwd methods implementation");

	}

	public static void main(String[] args) {
		MultipleLevelInheritance multipleLevelInheritance = new MultipleLevelInheritance();
		multipleLevelInheritance.gUn();
		multipleLevelInheritance.gPws();
		multipleLevelInheritance.fbUn();
		multipleLevelInheritance.fbPwd();
	}
}
