/*
Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
  (examples)
  input: [1,2,8,9,12,46,76,82,15,20,30]
  Output: 
    {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1} */

package com.project.tandemloop.problems;

public class Problem4 {
	 public static void main(String[] args) {
	int arr[]= {1,2,8,9,12,46,76,82,15,20,30};
	
	System.out.print("{");
	
	for(int d=1;d<=9;d++) {
		int count=0;
		
		for(int n:arr){
			if(n%d ==0) {
				count =count+1;
			}
			
		}
		
		System.out.print(d+ ": "+count);
		
		if(d<9) {
			System.out.print(",");
		}
	}
	System.out.print("}");
}

}
