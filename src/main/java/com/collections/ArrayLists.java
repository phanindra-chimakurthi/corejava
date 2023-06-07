package com.collections;
import java.util.*;
public class ArrayLists {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		float n=read.nextFloat();
		ArrayList<Float> Arr=new ArrayList<Float>();
		ArrayList<Float> Arr1=new ArrayList<Float>();
		System.out.println("the size of array is: "+Arr.size());
		Arr.add(3.5f);
		Arr.add(3.7f);
		Arr.add(n);
		Arr1.add(5.7f);
		Arr.addAll(Arr1);
		Arr.add(1,4.56f);
		System.out.println(Arr);
		System.out.println("the size of array is: "+Arr.size());
		read.close();
		Arr.remove(1);
		System.out.println(Arr);
		System.out.println(Arr.contains(4.5f)+"\n");
//		Float ia[]=new Float[Arr.size()];
//		ia=Arr.toArray(ia);
		float sum=0;
		for(float i:Arr) {
			sum=sum+i;
			
		}
		System.out.println(sum);
		Iterator<Float> iter=Arr.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
