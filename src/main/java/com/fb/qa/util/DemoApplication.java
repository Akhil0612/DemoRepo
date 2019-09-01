package com.fb.qa.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class DemoApplication {
	 public static void main(String args[]){  
		 
		
		 
		 
	
		 for(int i=1;i<=100;i++){
			 Boolean flag=true;
			 for(int j=2;j<i-1;j++){
				 if (i%j==0){
					flag=false;
					break;
				 }
				 
			 }
			 
			 if(flag==true){
			System.out.println(i);
			 }
			 
			 
		 }
		
	}
}
	
	 
	 

