package batch35;

public class Encapsulation_2 {
	private String username = "mail@gmail.com";
	private String password = "34245325";
	private int dob = 2024034;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public static void main(String[] args) {
		Encapsulation_2 e2 = new Encapsulation_2();
		e2.setUsername("mail1@gmail.com");
		System.out.println(e2.getUsername());
		e2.setPassword("123456");
		System.out.println(e2.getPassword());
		e2.setDob(34323532);
		System.out.println(e2.getDob());

	}

}
