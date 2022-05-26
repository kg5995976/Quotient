package com.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) throws IOException {
		//create a file
		File f=new File("D:\\Programjava\\File.txt");//JVM created file
		
		if(f.exists())
		{
			System.out.println("File exit");
			}else {
				try {
					f.createNewFile();
				}catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		//Write data inside a file
		FileWriter fw=new FileWriter("D:\\Programjava\\File.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("JAVA DEVELOPER for Project1");
		bw.close();
		
		//read data from file
		FileReader fr=new FileReader("D:\\Programjava\\File.txt");
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		System.out.println(data);
			
		
	}

}
