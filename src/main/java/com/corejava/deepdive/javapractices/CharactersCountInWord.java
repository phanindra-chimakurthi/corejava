package com.corejava.deepdive.javapractices;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class CharactersCountInWord {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		String s=read.nextLine();
//		char[] c=s.toCharArray();
//		Arrays.sort(c);
//		for(int i=0;i<c.length;i++) {
//			int count=StringUtils.countMatches(s, c[i]);
//			if(i!=c.length-1 && c[i]==c[i+1]) {
//				continue;
//			}
//			System.out.println(c[i]+"-"+ count);
//		}
		int count=StringUtils.countMatches(s, "Technologies");
		System.out.println(count);
		read.close();
	}

}
