package com.collections;
import java.util.*;

public class HashSetcol {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		System.out.println("size of hashset"+hs.size());
		hs.add("ball");
		hs.add("apple");
		hs.add("bat");
		hs.add("apple");
		hs.add("cat");
		System.out.println("elements of hashset: "+hs);
		System.out.println("size of hashset: "+hs.size());
	}

}
