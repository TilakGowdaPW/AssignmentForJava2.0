package ai.ineuron.trail;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class Students implements Externalizable {
	private String name;
	private int age;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

	public Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();

	}

	public static void main(String[] args) throws Exception {
		Students ST = new Students("vik", 20);

		FileOutputStream FOS = new FileOutputStream(
				"D:\\Eclipse Files\\IneuronTrails\\src\\ai\\ineuron\\trail\\vik.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(FOS);
		objectOutputStream.writeObject(ST);
		objectOutputStream.flush();
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream(
				"D:\\Eclipse Files\\IneuronTrails\\src\\ai\\ineuron\\trail\\vik.txt");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		 Students name=(Students)inputStream.readObject();
		 inputStream.close();
		 System.out.println(name);
		 
	}

}
