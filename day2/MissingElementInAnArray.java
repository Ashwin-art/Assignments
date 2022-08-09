package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		//By subtracting the sum of actual range with the sum provided range from array we can get the missing number easily.
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		int arraySum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arraySum = arraySum + arr[i];
			
			
		}
		
		System.out.println(arraySum);
		
		int rangeSum = 0;
		
		for(int i = 1; i <= 8; i++) {
			
			
			rangeSum = rangeSum + i;
			
		}
		
		System.out.println(rangeSum);
		
		System.out.println("Missing Number is: " +(rangeSum-arraySum));
		

	}

}
