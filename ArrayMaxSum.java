/*Maximum sum of i*arr[i] among all rotations of a given array
Input: arr[] = {8, 3, 1, 2}
Output: 29
Explanation: Lets look at all the rotations,
{8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
{3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
{1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
{2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*3 = 17*/




public class ArrayMaxSum{
	public static void main(String[] args){

		int[] arr = new int[]{8,3,1,2};

		System.out.println(ArrayMaxSum.arrayMaxSum(arr));
		// ArrayMaxSum.rotateArray(arr);
	}

/*	public static void rotateArray(int[] arr){
		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr.length; j++){
				
				int index = (i+j)% arr.length;
				System.out.print(index);
			}
		}
*/
	

	public static int arrayMaxSum(int[] arr){
		int maxSum = 0;

		for(int i=0; i<arr.length; i++){
			int currSum = 0;

			for(int j=0; j<arr.length; j++){
				
				int index = (i+j)% arr.length;
				currSum += j * arr[index];

				if(currSum > maxSum){
					maxSum = currSum;
				}
			}
		}
		return maxSum;
	}
}

//