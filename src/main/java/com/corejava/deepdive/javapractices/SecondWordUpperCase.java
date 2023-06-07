package com.corejava.deepdive.javapractices;
import  java.util.Scanner;

public class SecondWordUpperCase {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter the string: ");
		String input=read.nextLine();
		String[] s=input.split(" ");
		if(s.length<2)
			System.out.println("LESS");
		else {
			for(int i=0;i<s.length;i++) {
				if(i==2) {
					System.out.println(new StringBuffer(s[i].toUpperCase()));
				}
			}
		}
		read.close();
	}

}
