/*
Copyright 2010 kiddy
 */
package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class UTF8FileWriter {
	public static void main(String[] args) {
		File file = new File("utf8File.txt");
		OutputStreamWriter outWriter = null;
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(file);
			outWriter = new OutputStreamWriter(fout, "utf-8");
			outWriter.write("Hello World!");
			outWriter.flush();
			outWriter.close();
			System.out.println("Successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
