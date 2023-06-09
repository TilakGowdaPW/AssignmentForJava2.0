package ai.ineuron.StaticEncapsulationAss;

public class Person {
	// instance variables
	public String name;
	public int age;

	// constructor with parameters
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

class Demo {
	public static void main(String[] args) {
		// create an instance of the Person class using the constructor
		Person person1 = new Person("John Doe", 25);

		System.out.println(person1.name);
		System.out.println(person1.age);
	}
}
