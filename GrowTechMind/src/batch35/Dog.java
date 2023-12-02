package batch35;

public class Dog extends Animal{
	void bark() {
		System.out.println("bark");
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		
	}
}