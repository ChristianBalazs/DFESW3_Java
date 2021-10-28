package com.qa.sets;

import java.util.ArrayList;
import java.util.HashSet;

public class Sets {

	public static void main(String[] args) {
		
		
		ArrayList<String> arrList = new ArrayList<>();
		
		arrList.add("Ed");
		arrList.add("Christian");
		arrList.add("Lauren");
		arrList.add("Luke");
		arrList.add("Claire");
		arrList.get(1);
		arrList.size();
		arrList.remove(0);
		arrList.forEach(System.out::println);
		System.out.println("=======");
		
		HashSet<String> animals = new HashSet<String>();
		animals.add("Panda");
		animals.add("Tiger");
		animals.add("Koala");
		System.out.println(animals.size());
		animals.remove("Tiger");
		animals.forEach(System.out::println);		
		animals.clear();
		System.out.println(animals.size());
		
		
		

	}

}
