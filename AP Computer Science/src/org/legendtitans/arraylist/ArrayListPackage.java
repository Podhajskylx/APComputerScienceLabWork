package org.legendtitans.arraylist;

import java.util.ArrayList;

public class ArrayListPackage {
	
	public static void main(String[] args) {
		//Create an Array
		String[] coolPeople = new String[3];
		
		//Add values
		coolPeople[0] = "Person1";
		coolPeople[1] = "Person2";
		coolPeople[2] = "Person3";
		
		//get values
		System.out.println(coolPeople[0]);
		System.out.println(coolPeople[1]);
		System.out.println(coolPeople[2]);
		System.out.println("\n");
		
		//Create an Array List
		ArrayList<String> notCoolPeople = new ArrayList <String>();
		
		//add values
		notCoolPeople.add("notPerson1");
		notCoolPeople.add("notPerson2");
		notCoolPeople.add("notPerson3");

		
		//get values
		System.out.println(notCoolPeople.get(0));
		System.out.println(notCoolPeople.get(1));
		System.out.println(notCoolPeople.get(2));
		System.out.println("\n");
		
		//Remove the middle element 
		notCoolPeople.remove(1);
		
		//add a new string 
		notCoolPeople.add("newPerson");
		
		//Reprint values
		System.out.println(notCoolPeople.get(0));
		System.out.println(notCoolPeople.get(1));
		System.out.println(notCoolPeople.get(2));
		
		
	}
}
