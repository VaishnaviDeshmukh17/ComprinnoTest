package com;
import java.util.*;
public class Sticks {


	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();

		while (T-- > 0) {

			int N = s.nextInt();
			Integer[] sticks = new Integer[N];
			
			for(int i=0; i<N; i++) {
				 sticks[i] = s.nextInt();	
			}
			int length=0;
			int breadth=0;
			int area = 0;
			
			Arrays.sort(sticks,Collections.reverseOrder());
			
			for (int j = 0; j < N-1; j++) {
				for (int i = j+1; i < N; i++) {
					if(sticks[j]==sticks[i] && length==0) {
							length = sticks[j];
							j=j+2;
							i=i+1;
						}
					else if(sticks[j]==sticks[i] && length!=0) {
						breadth = sticks[j];
						break;
					}
				}
			}
			
			if(length>0 && breadth>0) {
				area = length*breadth;
				System.out.println(area);
			}else {
				System.out.println("-1");
			}
				
				
		}
	}
}