/*Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
*/
import java.util.Queue;
import java.util.LinkedList;

public class DuplicateZero{

	public static void main(String[] args){
		int[] arr = new int[]{1,0,2,3,0,4,5,0};
		duplicateZero(arr);
	}

	public static void duplicateZero(int[] arr){
		
		Queue<Integer> queue = new LinkedList<>();

		for(int i=0; i< arr.length; i++){
			if(arr[i]==0){
				queue.add(0);
				queue.add(0);
			}else{
				queue.add(arr[i]);
			}

			int first = queue.poll();
			arr[i]=first;
		}			

		for(int num : arr){
			System.out.print(num+ " ");
		}
	}

}

//[1,0,2,3,0,4,5,0]

// Queue ==   5 ,0

// Arr [1,0,0,2 , 3,0,0,4]

//O(1) O(n)