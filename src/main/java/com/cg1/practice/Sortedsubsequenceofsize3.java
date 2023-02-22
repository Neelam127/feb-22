package com.cg1.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class Solution4 {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        // add code here.
        
        ArrayList<Integer> a=new ArrayList<>();
        
        ArrayList<Integer> a1=new ArrayList<>();
        
        
        for(int i=0;i<arr.size();i++){
            if(!a1.contains(arr.get(i))){
                a1.add(arr.get(i));
            }
        }
        
        Collections.sort(a1);
        if(a1.size()>2){
        for(int i=0;i<a1.size()-2;i++){
            if(a1.get(i)<a1.get(i+1)&&a1.get(i+1)<a1.get(i+2)){
                a.add(a.get(i));
                a.add(a.get(i+1));
                a.add(a.get(i+2));
                
                
                
            }
        }
        }
        for(int i=0;i<a1.size();i++){
            arr.set(i,a.get(i));
        }
        return arr;
    }
}


public class Sortedsubsequenceofsize3 {
	
	public static void main(String[] args) {
		Solution4 sol=new Solution4();
		
		ArrayList<Integer> arrlist=new ArrayList<>();
		arrlist.add(10);
		arrlist.add(1);
		arrlist.add(3);
		arrlist.add(6);
		ArrayList<Integer> arr=sol.find3Numbers(arrlist, 12);
		System.out.println(arr);
	}

}
