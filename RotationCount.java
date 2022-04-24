/*Find the Rotation Count in Rotated Sorted array
input: arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
Explanation: Initial array must be {2, 3, 6, 12, 15, 18}. We get the given array after rotating the initial array twice.*/

import java.util.Arrays;

public class RotationCount{

	public static void main(String[] args){

		int[] arr = new int[]{7, 9, 11, 12, 5};
		int n = arr.length;
		System.out.println(RotationCount.rotationCountUsingBinarySearch(arr, 0 , n-1));

	}


	public static int rotationCount(int[] arr){
		int min = arr[0];
		int min_index = 0;

		for(int i=0; i< arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
				min_index = i;
			}
		}

		return min_index;
	}

	public static int rotationCountUsingBinarySearch(int[] arr , int low , int high){

		if(high < low)
			return 0;

		if(high == low)
			return low;

		int mid = (low + high) >>> 1;

		if((mid < high) && arr[mid] > arr[mid + 1])
			return mid+1;

		if((mid > low) && arr[mid] < arr[mid - 1])
			return mid;

		if(arr[high]>arr[mid])
			return rotationCountUsingBinarySearch(arr, low , mid-1);
		return rotationCountUsingBinarySearch(arr, mid+1,high);

	}


}

