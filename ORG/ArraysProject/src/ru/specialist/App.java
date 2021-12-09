package ru.specialist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		//int nums[];
//		int[] nums = new int[3];
//		nums[0] = 100;
//		nums[1] = 23;
		//int[] nums = new int[] {100, 23, 0};
		int[] nums = {100, 23, 0};
		
		System.out.println(nums.length);
		
		Arrays.sort(nums);
		for(int i=0; i < nums.length; i++)
			System.out.println(nums[i]);
			
		//System.out.println(nums[0]);
		//System.out.println(nums[1]);
		//System.out.println(nums[2]);
		
		
		String[] names = new String[] {"Сергей", "Костя", "Саша"};
		
		Arrays.sort(names);
//		for(int i=0; i < names.length; i++)
//			System.out.println(names[i]);
		for(String name : names)
			System.out.println(name);
		
		
		int[][] matrix = {
			{1,2,3},	
			{4,5}
		};
		
		System.out.println(matrix.length);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++)
				System.out.printf("%4d", matrix[i][j]);
			System.out.println();
		}
		
		//int
		//Integer
		// double
		//Double d = new Double(2.5);
		//char
		//Character
		int k = 5;
		Integer q = 5; // boxing
		int qq = q;    // unboxing 
		
		
		//ArrayList<Integer>
		List<String> persons = new ArrayList<String>();
		System.out.println(persons.size());
		
		persons.add("Сергей");
		persons.add("Саша");
		persons.add("Костя");
		persons.add("Елена");
		
		Collections.sort(persons);
		
		//persons.set(1, "Александр");
		//persons.remove(3);
		
		System.out.println(persons.size());
		
//		Iterator<String> iter = persons.iterator();
//		while(iter.hasNext()) {
//			String p = iter.next();
//			System.out.println(p);
//		}
		//for(String p : persons)
		//	System.out.println(p);
		for(var p : persons)
			System.out.println(p);
		//p.isEmpty()
		//p.isBlank()

		
		
		// bad
		//for(int i=0; i < persons.size(); i++)
		//	System.out.println(persons.get(i));
		

	}

}
