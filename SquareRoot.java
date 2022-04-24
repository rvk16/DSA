// Find Square Root without using any operator or function
// [1,2,3,4,5]

public class SquareRoot{

	public static void main(String[] args){

		System.out.println(squareRoot(5));
		
	}

	public static int squareRoot(int x){
		int left = 0;
		int right = x;

		if(x < 2){
			return x;
		}

		while(left < right){
			int mid = (left + right) >> 1;

			if(mid * mid == x){
				return mid;
			}else if(x > mid * mid){
				left = mid-1;
			}else if(x < mid * mid){
				right = mid-1;
			}
		}

		return left-1;
	}
}