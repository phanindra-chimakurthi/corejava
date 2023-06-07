package com.collections;
import java.util.*;
public class HashMapJulie {
	public static void main(String[] args) {
		HashMap<String,Integer> hs=new HashMap<String,Integer>();
		hs.put("phani", 89);
		hs.put("ravi", 78);
		hs.put("lekhana", 23);
		hs.put("pavan", 45);
		hs.put("daniel", 39);
		hs.put("kishore", 40);
		System.out.println(hs);
		Set<Map.Entry<String,Integer>> set=hs.entrySet();
		Stack<String> pass=new Stack<String>();
		for(Map.Entry<String,Integer> set1:set) {
			if(set1.getValue()>75)
				pass.push(set1.getKey());
		}
		while(!pass.isEmpty()) {
			pass.pop();
		}
		
		
		
		
		
	}

}
