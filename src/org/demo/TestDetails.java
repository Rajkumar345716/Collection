package org.demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class TestDetails {
public static void main(String[] args) {	
//Map<Integer, String> m =new HashMap<>();
//m.put(10, "java");
//m.put(20, "sql");
//m.put(30, "Testing");
//m.put(40, "oracle");
//m.put(50, "db");
//m.put(60, "selenium");
//m.put(10, "Automation");
//m.put(40, "Springboot");
//m.put(30, "Testing");
////entryset
//Set<Entry<Integer, String>> entrySet = m.entrySet();
//for (Entry<Integer, String> b : entrySet) {
//System.out.println(b);
////getkey
//Integer key = b.getKey();
//System.out.println(key);
////getvalue
//String value = b.getValue();
//System.out.println(value);
//}
//Map<Integer, String> m1 =new LinkedHashMap();
//m1.put(10, "java");
//m1.put(20, "sql");
//m1.put(50, "Report");
//m1.put(30, "Testing");
//m1.put(40, "Datadriven");
//m1.put(50, "Report");
//m1.put(60, "cucumber");
//m1.put(10, "Automation");
//m1.put(40, "Springboot");
//m1.put(30, "Testing");
//Set<Entry<Integer, String>> entrySet2 = m1.entrySet();
//for (Entry<Integer, String> c : entrySet2) {
//	System.out.println(c);
//	//getket
//	Integer key = c.getKey();
//	System.out.println(key);
//	//getvalue
//	String value = c.getValue();
//	System.out.println(value);
//}

Map<Integer, String> m11 =new TreeMap();

m11.put(10, "java");
m11.put(20, "sql");
m11.put(30, "Testing");
m11.put(40, "Datadriven");
m11.put(50, "Report");
m11.put(60, "cucumber");
m11.put(10, "Automation");
m11.put(40, "Springboot");
m11.put(30, "Testing");

Set<Entry<Integer, String>> entrySet3 = m11.entrySet();
for (Entry<Integer, String> d : entrySet3) {
	System.out.println(d);
	//getkey
	Integer key = d.getKey();
	System.out.println(key);
	//getvalue
	String value = d.getValue();
	System.out.println(value);
}

Map<String, String> m2 = new Hashtable<>();
m2.put("vel", "Selenium");
m2.put("Ganesh", "framework");
m2.put("Dinesh", "oracle");
m2.put("Vengat", "corejava");
m2.put("subash", "jira");
Set<Entry<String, String>> entrySet4 = m2.entrySet();
for (Entry<String, String> entry : entrySet4) {
	for (Entry<String, String> s : entrySet4) {
		System.out.println(s);
		//getvalue
		String key = s.getKey();
		System.out.println(key);
		//getvalue
		String value = s.getValue();
		System.out.println(value);
		
	}
	
}




}
}
