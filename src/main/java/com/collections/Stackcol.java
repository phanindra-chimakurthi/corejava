package com.collections;
import java.util.*;

public class Stackcol {
	public static void main(String[] args) {
		Stack<String> stk=new Stack<String>();
		System.out.println("size of stack: "+stk.size());
		stk.push("a");
		stk.push("b");
		stk.push("c");
		System.out.println("elements in stack: "+stk );
		stk.pop();
		System.out.println("size of stack: "+stk.size());
		System.out.println("elements in stack: "+stk );
		Iterator<String> iter=stk.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}

}
