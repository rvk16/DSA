
import java.util.Arrays;

public class SortedSquare{
	public static void main(String[] args){
		int[] arr = new int[]{-4,-1,0,3,10};
		
		int[] result = sortedSquare(arr);

		for(int res : result){
			System.out.print(res+" ");
		}
	}

	public static int[] sortedSquare(int[] arr){
		int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i]=arr[i]*arr[i];
        }
        Arrays.sort(result);// search logic

        return result;
	}
}