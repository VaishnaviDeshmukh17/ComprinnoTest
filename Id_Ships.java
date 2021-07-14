package com;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Id_Ships {



		public static void main (String[] args) throws java.lang.Exception
		{
		        Scanner sc = new Scanner(System.in);
		        int T = sc.nextInt();
		        for(int i=0; i<T; i++){
		            char ch = sc.next().charAt(0);
		            if(ch == 'B' || ch== 'b')
		            System.out.println("BattleShip");
		            else if(ch == 'C' || ch == 'c')
		            System.out.println("Cruiser");
		            else if(ch == 'D' || ch == 'd')
		            System.out.println("Destroyer");
		            else if(ch == 'F' || ch == 'f')
		            System.out.println("Frigate");
		            
		        }
		}
	}
