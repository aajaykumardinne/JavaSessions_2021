package PracticeProblems;

import java.util.Arrays;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		
		
		int numbers[] = {-10, 24, 50, -88, 987676};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		// time complexity : O(n) -- as it has only 1 for loop
		for(int i=1; i<numbers.length;i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
			}
			else if(numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		
		System.out.println("given array is: "  +Arrays.toString(numbers));
		System.out.println("Largest number is: "  +largest);
		System.out.println("Smallest number is: " +smallest);
		
	}

}
