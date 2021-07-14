package com;
import java.util.*;
public class CatAndDogs {
	
	    public static void main(String [] args) {
	        Scanner s = new Scanner(System.in);
	        int test = Integer.parseInt(s.nextLine().trim());
	        while(test>0) {
	            long c = s.nextInt();
	            long d = s.nextInt();
	            long l = s.nextInt();
	            s.nextLine();
	            
	            long d_legs = 4*d;
	            long c_legs = 4*c;
	            long max = c_legs + d_legs;
	            long min;
	            if(c>2*d){
	                    min = 4*(c - (2*d)) + d_legs;
	            }
	            else {
	                min = d_legs;
	            }
	            if(l%4!=0 || l < d_legs || l>max || l<min) {
	                
	                System.out.println("no");
	            }
	            else {
	                System.out.println("yes");
	            }
	            
	            test--;
	        }
	    }
	}
