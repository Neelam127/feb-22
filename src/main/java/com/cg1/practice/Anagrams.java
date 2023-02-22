package com.cg1.practice;

import java.util.Arrays;

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        
        int str1=a.length();
        int str2=b.length();
        
        if(str1!=str2){
            return false;
        }
        
        char[] aChaArr=a.toCharArray();
        char[] bCharArr=b.toCharArray();
        
        Arrays.sort(aChaArr);
        Arrays.sort(bCharArr);
        
        for(int i=0;i<bCharArr.length;i++){
            if(aChaArr[i]!=bCharArr[i]){
                return false;
            }
        }
        
        return true;
        
    }
}

public class Anagrams {
	
	public static void main(String[] args) {
		Solution sol=new Solution();
		sol.isAnagram("Neelam", "Neelam");
	}

}
