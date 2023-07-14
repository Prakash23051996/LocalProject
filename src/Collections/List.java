package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class List {
	
	public static void main(String[] args) {
//		ArrayList li = new ArrayList();
//		
//		li.add(10);
//		li.add("Prakash");
//		li.add("Finvi");
//		
//		System.out.println(li.size());
//		
//		li.add(1,"Jothivel");
//		System.out.println(li.size());
//		
//		System.out.println(li);
//		
		
//		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		map.put("Prakash",26);
		map.put("Nithyasri",17);
		map.put("Madhavi",45);
		map.put("Saranya",100);
		map.put("Bhoomika",null);
		
		
		for (Map.Entry<String,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
			
		}
		
		
//		System.out.println("Key: "+map.keySet());
//		
//		
//		System.out.println(map);
//		System.out.println(map.size());
//		
//		
		
//		
//		Set s= new LinkedHashSet();
//		s.add("java");
//		s.add(10);
//		s.add("!@#$%^&");
//		System.out.println(s);
//		
//		
//		 String input = "hello world";
//		    LinkedHashMap<Character, Integer> m = new LinkedHashMap<>();
//		    String replaceAll = input.replaceAll("\\s", "");
//		    for (int i = 0; i < replaceAll.length(); i++) {
//		      char c = replaceAll.charAt(i);
//		      if (m.containsKey(c)) {
//		        m.put(c, m.get(c) + 1);
//		      } else {
//		        m.put(c, 1);
//		      }
//		    }
//		    System.out.println(m);
//		    
//		    
//		    
//		    
//		    String name = "Prakash";
//		    String str = "Prakash is a great developer. Prakash is a smart person.";
//		    int count = 0;
//		    int index = 0;
//		    while (index != -1) {
//		        index = str.indexOf(name, index);
//
//		        if (index != -1) {
//		            count++;
//		            index += name.length();
//		        }
//		    }
//		    System.out.println("Number of occurrences of " +"\"" +name+"\"" + " in the given string: " + "\"" +count+"\"");	    
	}

}
