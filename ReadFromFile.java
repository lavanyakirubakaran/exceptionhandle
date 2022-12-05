package com.java1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFromFile {
	

	public static void main(String arg[]){
		try{
		File f=new File("C:/Users/ELCOT/Desktop/git/LAVANYA.docx");
		Scanner s=new Scanner(f);
		while(s.hasNextLine()){
		String fileData=s.nextLine();
		System.out.println(fileData);}
		s.close();
		}catch(FileNotFoundException fnf) {
		fnf.printStackTrace();}}}

