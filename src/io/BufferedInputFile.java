/*
Copyright 2010 kiddy
*/
package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
	public static String
		read(String fileName) throws IOException{
		BufferedReader in = new BufferedReader(
				new FileReader(fileName));
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = in.readLine()) != null)
			sb.append(s + "\n");
		in.close();
		return sb.toString();
	}
	
	public static void main(String[] args) 
		throws IOException{
		// TODO Auto-generated method stub
		//System.out.print(read("D:/Program Files/eclipse/workspace/ThinkingJava/src/io/BufferedInputFile.java"));
		System.out.print(read("src\\io\\BufferedInputFile.java"));
	}

}
