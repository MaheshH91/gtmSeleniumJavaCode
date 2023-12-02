package batch35;

class cat extends Animal{
	void mew() {
		System.out.println("Meeww");
	}
	public static void main(String[] args) {
		cat c= new cat();
		c.eat();
		c.mew();
	}
}