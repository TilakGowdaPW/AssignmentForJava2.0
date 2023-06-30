package ai.ineuron.trail;

public class Dog extends Animal {
	private String breed;

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("overrided eat method");
	}
}
