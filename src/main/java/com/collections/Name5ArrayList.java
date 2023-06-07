package com.collections;
import java.util.*;
public class Name5ArrayList {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter how many names you want to input: ");
		int n=read.nextInt();
		ArrayList<String> str=new ArrayList<String>();
		System.out.println("Enter the names: ");
		for(int i=0;i<n;i++) {
			String st1=read.next();
			if(st1.length()>5)
				str.add(st1);
		}
//		for(int i=0;i<n;i++) {
//			if((a[i].length())>5) {
//				System.out.println(a[i]);
//			}
//		}
		
		Iterator<String> iter=str.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
