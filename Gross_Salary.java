package com;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Gross_Salary {


	
		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner scan = new Scanner(System.in);
			while(scan.hasNextInt())
			{
			    int t = scan.nextInt();
	            while(t-- >0)
	    	    {
	        	    double n = scan.nextInt();
	        	    double gross_sal=0.0;
	        	    if(n<1500)
	        	    {
	        	         gross_sal = n +  (n * 10)/100 + (n * 90)/100;
	        	         System.out.format("%.2f %n", gross_sal);
	        	    }
	        	    else if(n>=1500)
	        	    {
	        	        gross_sal = n + 500 + (n*98)/100;
	        	        System.out.format("%.2f %n", gross_sal);
	        	    }
	    	    }   
			}
	    }
	}
