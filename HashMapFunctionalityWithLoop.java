package com.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapFunctionalityWithLoop {

	private HashMap<String, ArrayList<String>> hasmp_list;

	private ArrayList<String> aa;
// Try this method and you will get the blank array 
	private void wrongApproachExecuteMethod() {

		hasmp_list = new HashMap<String, ArrayList<String>>();
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				aa = new ArrayList<String>();
				aa.add(String.valueOf(i));

				hasmp_list.put(String.valueOf(j), aa);
				aa.clear(); // here we are clearing the data of arraylist and it will directly reflect with hashmap because of same object.
				if(j == 9) {
					if(i==9) {
				System.out.println(String.valueOf(hasmp_list) + " Wrong Execution Method of hashmapValue");
				}}
			}
		}

	}
	
	private void rightApproachExecuteMethod() {

		hasmp_list = new HashMap<String, ArrayList<String>>();
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				aa = new ArrayList<String>();
				
				if(hasmp_list.get(String.valueOf(j)) == null) {
					
					hasmp_list.put(String.valueOf(j), new ArrayList<String>());
					
				}
				hasmp_list.get(String.valueOf(j)).add(String.valueOf(i));
				
				aa.clear(); // here we are clearing the data of arraylist and it will directly reflect with hashmap because of same object.
				if(j == 9) {
					if(i==9) {
				System.out.println(String.valueOf(hasmp_list) + " Right Execution Method of hashmapValue");
				}}
			}
		}

	}

	
	

	public static void main(String[] args) {
		
		HashMapFunctionalityWithLoop hh = new HashMapFunctionalityWithLoop();
		hh.wrongApproachExecuteMethod();
		hh.rightApproachExecuteMethod();

	}

}
