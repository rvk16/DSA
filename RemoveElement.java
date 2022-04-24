
public class RemoveElement{

	public static void main(String[] args){
		int[] nums = new int[]{3,2,2,3};
		int val = 3;
		removeElement(nums,val);
	}

	private static int removeElement(int[] nums, int val){
		int numsLength = nums.length;

		for(int i=0; i<numsLength; i++){
			if(nums[i]==val){
				for(int j=i+1; j<numsLength; j++){
					nums[j-1] = nums[j];
				}
				numsLength--;
			}
		}

		for(int i=0; i<numsLength; i++){
			System.out.print(nums[i]+" ");
		}

		return numsLength;
	}
}