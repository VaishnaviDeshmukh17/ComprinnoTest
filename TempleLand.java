package com;

import java.util.*;
import java.lang.*;
import java.io.*;

	public class TempleLand
	{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the how many input you want to give");
			int t = sc.nextInt();
			//while loop will execute upto t is greater than t
			while(t>0)
			{
				System.out.println("Enter the size of values");
				int n = sc.nextInt();
				int[] a = new int[n];
				for(int i = 0; i < n; i++)
				{
					System.out.println("Enter the value at index "+i);
					a[i] = sc.nextInt();
				}
				//it'll check n%2!=1 condition if condition is true then if block will excute otherwise else
				if(n%2 != 1)
					System.out.println("no");
				else
					checkTempleOfCobra(a, n);
			}
			sc.close();
		}
		static void checkTempleOfCobra(int[] a, int n)
		{
			int c = 1;
			boolean b = false;
			for(int i = 0, j = n-1; i <=j; i++, j--)
			{
				if(!(a[i] == a[j] && a[i] == c))
				{
					b = true;
					break;
				}
				else
					c++;
			}
			
			if(b)
				System.out.println("no");
			else
				System.out.println("yes");
		}
	}