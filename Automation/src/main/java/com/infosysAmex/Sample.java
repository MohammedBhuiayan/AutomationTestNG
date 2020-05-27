package com.infosysAmex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String[] args) {
		
		int [] a = {10, 20,30,40};
		
		System.out.println(Arrays.toString(a));
		
		List <Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20);
		
		int maxNum = Collections.max(list);
		
		list.stream().distinct().collect(Collectors.toList());
		
		
		
	}
	
	

}
