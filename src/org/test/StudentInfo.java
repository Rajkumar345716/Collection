package org.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentInfo {
	public static void main(String[] args) {
//		Set s= new HashSet();
//		s.add(10);
//		s.add(20);
//		s.add(30);
//		s.add(40);
//		s.add(10);
//		s.add(30);
//		s.add(null);
//		System.out.println(s);
		
//		Set s1= new LinkedHashSet();
//		s1.add(20);
//		s1.add(10);
//		s1.add(30);
//		s1.add(40);
//		s1.add(10);
//		s1.add(30);
//		s1.add(null);
//		System.out.println(s1);
//		

//		Set s2= new TreeSet();
//		s2.add(20);
//		s2.add(30);
//		s2.add(10);
//		s2.add(40);
//		s2.add(10);
//		s2.add(30);
//		System.out.println(s2);
//		
//		List li = new ArrayList();
//		li.add(10);
//	    li.add(20);
//	    li.add(30);
//		li.add(90);
//		li.add(10);
//		li.add(50);
//		
//		Set s = new HashSet();
//		s.addAll(li);
//		System.out.println(s);
		
		
//		Set s = new HashSet<>();
//		
//		s.add(105);
//		s.add(205);
//		s.add(305);
//		s.add(405);
//		s.add(505);
//		s.add(605);
//		s.add(705);
//		s.add(805);
//		
//		
//		
//		for (Object b : s) {
//			System.out.println(b);
//		}
//		
//Set s1 = new TreeSet<>();
//		
//		s1.add(10);
//		s1.add(20);
//		s1.add(30);
//		s1.add(40);
//		s1.add(50);
//		s1.add(60);
//		s1.add(70);
//		s1.add(80);
//		s1.add(10);
//		s1.add(50);
//		
//		for (Object c : s1) {
//			System.out.println(c);
//		}
//		
	Set s = new LinkedHashSet<>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(50);
	s.add(10);

	List li = new ArrayList<>();
	li.add(10);
	li.add(30);
	li.add(60);
	li.add(40);

	s.removeAll(li);
	System.out.println(s);
	
	
		
		
		
	}
	
}
