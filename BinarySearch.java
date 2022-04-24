
public class BinarySearch{
	public static void main(String[] args){
		int[] nums = new int[]{1,2,3,4,5,6};
		System.out.println(binarySearch(nums,4));
	}

	public static int binarySearch(int[] nums, int target){
		
		int left = 0;
		int right = nums.length - 1;
		
		if(nums.length == 0)
			return -1;

		while(left <= right){
			int mid = (left+right) >> 1;

			if(target == nums[mid]){
				return mid;
			}else if(target > nums[mid]){
				left = mid+1;
			}else{
				right = mid-1;
			}
		}

		return -1;
	}
}