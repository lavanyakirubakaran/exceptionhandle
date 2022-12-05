package com.java1;

public class Addition {
	static int add(int a, int b){
		if(a<=0||b<=0)
		throw new IllegalArgumentException("Don't pass number<=0");
		return a+b;}}
		class Calculator {
		public static void main(String arg[]){
		int res=Addition.add(3,-4);
		int b=res+50;
		System.out.println(b);}}

