package ai.ineuron.trail;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IO implements Serializable {

	private String name;
	private int age;

	public IO() {
		System.out.println("Running IO class");
	}

	public IO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) throws Exception {
		IO io=new IO("vik", 20);
		
		FileOutputStream fileOutputStream=new FileOutputStream("D:\\Eclipse Files\\IneuronTrails\\src\\ai\\ineuron\\trail\\vik.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(io);
	}

}
