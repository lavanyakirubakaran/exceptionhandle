package com.java1;
import java.io.*;
public class CheckedExceptionDemo {
	public static void main(String args[]) throws FileNotFoundException,IOException {
		FileInputStream fis=null;
		fis=new FileInputStream("D:/JavaProgram/Welcome.txt");
		int i;
		while((i=fis.read()) != -1) {
		System.out.print((char)i+""); }
		fis.close();}}


