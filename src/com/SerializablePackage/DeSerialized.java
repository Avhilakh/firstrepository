package com.SerializablePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialized {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("A.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Persist p1 = (Persist) ois.readObject();
		System.out.println("ID "+p1.id+ "Name "+ p1.name);
		Student st2 = (Student) ois.readObject();
		System.out.println(st2.Class + " Class " );
	}

}
