package com.corejava.deepdive.javapractices;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String s = read.nextLine();
		String j = "";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (j.indexOf(c[i]) == -1) {
				j=j+c[i];
			}
			

		}
		System.out.println(j);
		read.close();

	}
}
