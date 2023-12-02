package batch35;

abstract class GoogleAuth {
	abstract void userNameGoogle();

	abstract void passwordGoogle();

	static void loginGoogle() {
		System.out.println("Some Logic for GoogleAuth");
	}

	void oneTimePasswordByGoogle() {
		System.out.println("One time password by google");
	}
}

abstract class FacebookbAuth extends GoogleAuth {
	abstract void userNameFB();

	abstract void passwordFb();

	static void loginFacebook() {
		System.out.println("Some Logic for FacebookbAuth");
	}

	void oneTimePasswordByGoogle() {
		System.out.println("One time password by Google");
	}
}

public class ZoomAuth extends FacebookbAuth {

	public static void main(String[] args) {
		ZoomAuth z1 = new ZoomAuth();
		z1.userNameGoogle();
		z1.passwordGoogle();
		loginGoogle();
		z1.oneTimePasswordByGoogle();
		z1.userNameFB();
		z1.passwordFb();
		loginFacebook();
		z1.oneTimePasswordByGoogle();
	}

	@Override
	void userNameFB() {
		System.out.println("Username fb");

	}

	@Override
	void passwordFb() {
		System.out.println("password Fb");

	}

	@Override
	void userNameGoogle() {
		System.out.println("Username Google");

	}

	@Override
	void passwordGoogle() {
		System.out.println("password Google");

	}

}
