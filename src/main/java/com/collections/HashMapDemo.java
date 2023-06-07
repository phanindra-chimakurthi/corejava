package com.collections;
import java.util.*;


public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Double> tm=new HashMap<String,Double>();
		System.out.println("size of map is: "+tm.size());
		tm.put("phani", 23.56);
		tm.put("dany", 45.78);
		tm.put("karl", 34.67);
		System.out.println("elements are: "+tm);
		System.out.println("size of map is: "+tm.size());
		Set<Map.Entry<String, Double>> set=tm.entrySet();
		for(Map.Entry<String,Double> a:set) {
			System.out.print(a.getKey()+":");
			System.out.println(a.getValue());
			
		}
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		Scanner read=new Scanner(System.in);
		System.out.println("enter the key to find:");
		String s=read.next();
		if(tm.containsKey(s)) {
			System.out.print(s+":");
			System.out.print(tm.get(s));
			
		}else {
			System.out.println("no key is present that matches input");
		}
		
	}

}
