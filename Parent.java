package ai.ineuron.DoubtSession;

public class Parent {
	public String name;
	public int age;

	

	public Parent(Parent parent) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Parent parent = new Parent(null, 0);

	}
}
