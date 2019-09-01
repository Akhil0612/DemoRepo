package com.fb.qa.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class JavaCode {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		String names[]={"AAA","BBB","AAA","AAA"};
		
		HashMap<String, Integer> storemap=new HashMap<String, Integer>();
		
		for(String name:names){
			Integer count=storemap.get(name);
			if(count==null){
				storemap.put(name, 1);
			}else{
				storemap.put(name, ++count);
			}
				
			
		}
		
		Set<Entry<String,Integer>> entryset=storemap.entrySet();
		for(Entry<String,Integer> entry:entryset){
			if(entry.getValue()>1){
				System.out.println("The Duplicate value is " + entry.getKey());
			}
		}
	}
	

	}


