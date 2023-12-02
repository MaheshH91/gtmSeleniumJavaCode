package iterfacePackage;

interface FbAuth {
	void un();

	void pwd();

}

abstract class GoogleAuthentication implements FbAuth {
	abstract void googleusername();

	abstract void googlepassword();

	void login() {
		System.out.println("Login");
	}

	static void loginUsingOtp() {
		System.out.println("Login using OTP");
	}
}

public class GrowTechMindsWebsite extends GoogleAuthentication {
	void login() {
		System.out.println("Login");
	}

	static void loginAfterregistration() {
		System.out.println("Login after registration");
	}

	public static void main(String[] args) {
		loginAfterregistration();
		loginUsingOtp();
		GrowTechMindsWebsite growTechMindsWebsite = new GrowTechMindsWebsite();
		growTechMindsWebsite.googlepassword();
		growTechMindsWebsite.googlepassword();
		growTechMindsWebsite.un();
		growTechMindsWebsite.pwd();
		growTechMindsWebsite.login();

	}

	@Override
	public void un() {
		System.out.println("Username");

	}

	@Override
	public void pwd() {
		System.out.println("Password");

	}

	@Override
	void googleusername() {
		System.out.println("google username");

	}

	@Override
	void googlepassword() {
		System.out.println("google password");

	}

}
