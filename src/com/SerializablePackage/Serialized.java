package com.SerializablePackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.SerializablePackage.*;
public class Serialized {


	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("A.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		Persist obj = new Persist(1, "Avhi");
		out.writeObject(obj);
		Student st1 = new Student(2, 5,"static member not get serialized");
		out.writeObject(st1);   // Student class is subclass of Persist which implements Serializable interface
		                        // so it will convert in to byte stream
		out.flush();
		out.close();
		System.out.println("success");
	}

}
