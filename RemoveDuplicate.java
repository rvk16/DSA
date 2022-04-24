//Remove Duplicates

public class RemoveDuplicate{
	
	public static void main(String[] args){
		int[] nums = new int[]{1,2,2,3,3};

		removeDuplicate(nums);
	}

	private static int removeDuplicate(int[] nums){
		int j=0;
		int n= nums.length-1;
		
		for(int i=0; i<n; i++){
			if(nums[i]!=nums[i+1]){
				nums[j] = nums[i];
				j++;
			}
		}
		nums[j]=nums[n];

		for(int i=0; i<=j; i++){
			System.out.print(nums[i]+" ");
		}

		return j;
	}
}