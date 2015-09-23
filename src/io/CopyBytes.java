/*
Copyright 2010 kiddy
*/
package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.DocFlavor.BYTE_ARRAY;

public class CopyBytes {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//byte[] buffer = new byte[20];
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("xanadu.txt");
			out = new FileOutputStream("outagain.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Copy successfully!");
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}

}
