package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialableDemo implements Serializable {
	private String name;
	public static int count;

	static {
		count = 10;
	}

	public SerialableDemo(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		SerialableDemo demo1 = new SerialableDemo("kid");
		SerialableDemo demo2 = null;

		FileOutputStream fileOut = null;
		ObjectOutput objectOut = null;
		FileInputStream fileInput = null;
		ObjectInput objectInput = null;
		try {
			fileOut = new FileOutputStream(new File("out"));
			objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(demo1);
			fileInput = new FileInputStream(new File("out"));
			objectInput = new ObjectInputStream(fileInput);
			demo2 = (SerialableDemo) objectInput.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (demo2 != null) {
			System.out.println(demo1 == demo2);
			System.out.println(demo2.name);
		}
	}
}
