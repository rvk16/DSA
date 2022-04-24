/*

Search in Rotated Sorted Array

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Input: nums = [4,5,6,7,8,9,10,12,13,0,1,2], target = 3
Output: -1


Input: nums = [1], target = 0
Output: -1

To solve this algo in O(Logn)
*/

public class SearchInRotatedArray{

	public static void main(String[] args){
		int[] nums = new int[]{5,1,3};
		int target = 3;

		int i = searchInRotatedArray(nums,target);
		System.out.println(i);
	}


	public static int searchInRotatedArray(int[] nums, int target){

		int start=0;
		int end = nums.length-1;

		if(nums.length == 0){
			return -1;
		}

		while(start <= end){
			int mid = (start + end) >>> 1;

			if(nums[mid] == target){
				return mid;
			}

			if(nums[start] <= nums[mid]){  // Left Array Is Sorted
				if(target >= nums[start] && target < nums[mid]){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}else{ // Right Array is Sorted
				if(target > nums[mid] && target <= nums[end]){
					start = mid+ 1;
				}else{
					end = mid -1;
				}
			}

		}
		return -1;
	}
}


//[4,5,6,7,8,9,10,12,13,0,1,2]

13

//[4,5,6,7,0,1,2]
//[1,3]