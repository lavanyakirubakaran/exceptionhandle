package com.java1;

public class ExceptionDemo {
	static int x=10;
	static int m() {
	try {
	System.out.println("In Try");
	System.out.println(10/0);
	return 10;
	}catch(Exception e) {
	System.out.println("In Catch");
	return 20;}
	finally {
	System.out.println("In Finally");
	System.out.println(30);}}
	public static void main(String arg[]) {
	int x=m();
	System.out.println(x);}}
	/*Illegal Argument Exception
	class Addition {
	static int add(int a, int b){
	if(a<=0||b<=0)
	throw new IllegalArgumentException("Don't pass number<=0");
	return a+b;}}}
	class Calculator {
	public static void main(String arg[]){
	int res=Addition.add(3,-4);
	int b=res+50;
	System.out.println(b);}}
}
*/