/*
Copyright 2010 kiddy
*/
package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ByteArrayDemo {
	public static void main(String[] args) {
		/*
		ByteArrayOutputStream baOutput = new ByteArrayOutputStream();
		int a = 12, b =2, c = 3;
		baOutput.write(a);
		baOutput.write(b);
		baOutput.write(c);
		byte[] buff = baOutput.toByteArray();
		for(int i=0; i < buff.length; i++)
			System.out.print(buff[i]);
		System.out.println("\n****************");
		ByteArrayInputStream baInput = new ByteArrayInputStream(buff);
		while((b = baInput.read()) != -1) {
			System.out.print(b);
		}
		*/
		ByteArrayOutputStream bOut = new ByteArrayOutputStream();
		DataOutputStream dOut = new DataOutputStream(bOut);
		String str = "Hello";
		try {
			dOut.writeUTF(str);
		} catch(IOException e) {
			e.printStackTrace();
		}
		byte[] buff = bOut.toByteArray();
		for(int i=0; i < buff.length; i++) {
			System.out.print(buff[i]);
		}
		
	}
}
