/*
Copyright 2010 kiddy
*/
package io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File(args[0]);
			if(file.isFile()) {	//是否为文件
				System.out.println(args[0] + " 文件");
				System.out.print(
						file.canRead() ? "可读 " : "不可读 ");
				System.out.print(
						file.canWrite() ? "可写 " : "不可写 ");
				System.out.println(file.length() + "字节 ");
			}
			
			else {
				//列出所有的文件及目录
				File[] files = file.listFiles();
				List<File> fileList = new ArrayList<File>();
				//先列出目录
				for(int i = 0; i < files.length; i++) {
					if(files[i].isDirectory()) {	//是否为目录
						//取得路径名
						System.out.println("[" +
								files[i].getPath() + "]");
					}
					
					else {
						//文件先存入fileList，代会再列出
						fileList.add(files[i]);
					}
				}
				//列出所有文件
				for(File f : fileList) {
					System.out.println(f.toString());
				}
				System.out.println();
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("using: Java FileDemo pathname");
		}
	}

}
