package com.SerializablePackage;
import java.io.*;
class Persist implements Serializable{
	private static final long serialVersionUID = 1L;
	transient int id;
	String name;
	public Persist() {}
	public Persist(int i, String string) {
		// TODO Auto-generated constructor stub
		id =i;
		name = string;
	}

}
