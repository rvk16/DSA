//Find Count of Even Numbers Digits

public class EvenNumbers{

	public static void main(String[] args){
		int[] arr = new int[]{12,345,2,6,7896};
		System.out.println(findNumbers(arr));

	}

	public static int findNumbers(int[] nums) {
        int maxCount=0;

        for(int number : nums){
        	int countOfNumber=0;
        	while(number!=0){
        		number /= 10;
        		countOfNumber++;
        	}

        	if(countOfNumber % 2 == 0){
        		maxCount++;
        	}
        }
        return maxCount;
    }
}