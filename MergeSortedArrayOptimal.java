
public class MergeSortedArrayOptimal{

	public static void main(String[] args){
		int[] nums1 = new int[]{1,2,3,0,0,0};
		int[] nums2 = new int[]{2,5,6};
		int m = 3 ;
		int n = 3 ;

		mergeSortedArrayOptimal(nums1,m,nums2,n);
	}

	private static void mergeSortedArrayOptimal(int[] nums1, int m,int[] nums2 , int n ){

		int p1 = m -1;
		int p2 = n -1;
		int i = m + n - 1; 

		while(p2 >= 0){
			
			if(p1 >= 0 && nums1[p1] > nums2[p2]){
				nums1[i--] = nums1[p1--];
			}else{
				nums1[i--] = nums2[p2--];
			}				
		}
		
	}
}