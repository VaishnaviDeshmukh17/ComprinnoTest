package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciSeries{
	
	public static void main(String[] args) {
        //scanner is used to take the input from user
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the value for how many input you want to give");
		int t=sc.nextInt();
		//t-- >0 it will execute the loop upto t is greater than 0 & t-- will decreases the value of t
		while(t-- >0){
			//it'll take the input in string 
			System.out.println("Enter the name in lowercase");
			String s=sc.next();
			Map<Character, Integer> map=new HashMap<>();
			
			for(int i=0;i<s.length();i++){
				if(map.containsKey(s.charAt(i))){
					map.put(s.charAt(i),map.get(s.charAt(i)) +1);
					
				}
				else{
					map.put(s.charAt(i), 1);
					
				}
			}
			int[] dp=new int[map.size()];
			int i=0;
			for(Map.Entry<Character, Integer> entry:map.entrySet()){
				dp[i]=entry.getValue();
				i++;
			}
			boolean flag=false;
			Arrays.sort(dp);;
			if(dp.length<3){
				System.out.println("Dyanamic");
				
			}else{
				int tmp=dp[0];
				dp[0]=dp[1];
				dp[1]=tmp;
				if(checkfib(dp)==true){
					System.out.println("Dynamic");
				}
				else{
					System.out.println("Not");
				}
			}
		}

	}



 static boolean checkfib(int[] dp){
	 for (int i=2; i<dp.length; i++){
		 if(dp[i]!=dp[i-1]+dp[i-2]){
			 return false;
			 
		 }
	 }
	 return true;
 }
	 
 }
