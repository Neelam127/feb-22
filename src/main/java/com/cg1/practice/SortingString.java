package com.cg1.practice;

import java.util.Arrays;

class Solution3 
{ 
    String ReverseSort(String str) 
    { 
        // code here
      char arr[]=new char[str.length()];
			arr=str.toCharArray();
			Arrays.sort(arr);
			
			
			
			String a1 = "";
			
			for(int i=arr.length-1;i>=0;i--) {
				a1=a1+arr[i];
			}
			
		
        
        
        return (a1);
        
    }
} 

public class SortingString {
public static void main(String[] args) {
	Solution3 sol=new Solution3();
	String str=sol.ReverseSort("Neelam");
	System.out.println(str);
}
}
