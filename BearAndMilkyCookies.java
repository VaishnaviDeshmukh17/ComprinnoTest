package com;
import java.util.*;
import java.lang.*;
import java.io.*;
public class BearAndMilkyCookies {
	
		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the how many input you want to give");
			int t = sc.nextInt();
			//t-- >0 it will execute the loop upto t is greater than 0 & t-- will decreases the value of t
			while(t-->0){
				System.out.println("Enter the size of values");
			    int n = sc.nextInt();
			    String[] arr = new String[n];
				System.out.println("Enter the cookie or milk "+n+" times");

			    for(int i=0; i<n; i++){
			    	//it'll take the values from user in string format
			        arr[i] = sc.next();
			    }
			    boolean v=true;
			    for(int i=0; i<n-1; i++){
			    	//if arr[i] equals to cookie & arr[i+1] not equals to milk then it will break the execution
			        if(arr[i].equals("cookie") && !(arr[i+1].equals("milk"))){
			           v=false;
			           break;
			        }
			    }
			    if(arr[n-1].equals("cookie")){
			        v=false;
			    }
			    if(v)
			       {
			           System.out.println("YES");
			       }
			       else if(!v){
			           System.out.println("NO");
			       }
			}
		}
	}

