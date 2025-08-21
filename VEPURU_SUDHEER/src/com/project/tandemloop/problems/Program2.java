/*
Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1, 3
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5, 7
    .
    .
    5) input a = x, then output : 1, 3, 5, 7, ....... */
	
package com.project.tandemloop.problems;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		int a;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		a=sc.nextInt();
		int number =1;
		
		for(int i=1;i<=a;i++) {
			System.out.print(number);
			if(i<a) {
				System.out.print(',');
				
			}
			number = number +2;
		}
		

	}

}
