package com.rahul.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Streams_Lambdas {

	@Test
	public void streams1() {
		String names[] = {"rahul","sohan","mohan","ramu"};
		
		List <String> lname = Arrays.asList(names);
		
		List <String> newl = lname.stream().filter(s->s.startsWith("r")).map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(newl.get(0));
		
		
	}
	
}
