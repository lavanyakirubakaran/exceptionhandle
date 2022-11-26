package com.animals;

public class NULLPointerEcepionTest {
		public static void main(String args[]) {
		String s=null;
		String s1="Welcome";
		String[] s2={"Hi","Hello"};
		for(String i:s2)
		//System.out.println(s.length());//NullPointerException
		System.out.println(i.length());
		System.out.println(s1.length());}}

