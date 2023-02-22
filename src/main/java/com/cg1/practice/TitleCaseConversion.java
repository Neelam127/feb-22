package com.cg1.practice;

class Solution2
{
    public String transform(String s)
    {
        // code here
        
     String newStr="";
		
			 
String[] str=s.split(" ");

        
        for(int i=0;i<str.length;i++){
            newStr +=(Character.toUpperCase(str[i].charAt(0))) +str[i].substring(1)+" ";
            
        }
        
        return newStr;
    }
}

public class TitleCaseConversion {
public static void main(String[] args) {
	Solution2 sol=new Solution2();
	String str=sol.transform("neelam");
	System.out.println(str);
}
}
