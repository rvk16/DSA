
public class ArrayDeleteOperations{
	public static void main(String[] args){

		int[] intArray = new int[10];
		int length = 0;

		for(int i=0; i<6; i++){
			intArray[length] = i;
			length++;
		}
		//Printing an Array
		for(int i=0; i<length; i++){
			System.out.print(intArray[i]+" ");
		}
		System.out.println();

		//Deleting the last index of an array
		length --;
		for(int i=0; i<length; i++){
			System.out.print(intArray[i]+" ");
		}
		System.out.println();

		//Deleting the first index of an array
		for(int i=1; i<length; i++){
			int prevIndex = i-1;
			intArray[prevIndex] = intArray[i];
		}
		length--;

		for(int i=0; i<length; i++){
			System.out.print(intArray[i]+" ");
		}
		System.out.println();

		//Deleting the element from index 3
		for(int i=4; i<length; i++){
			int prevIndex = i-1;
			intArray[prevIndex] = intArray[i];
		}
		length--;

		for(int i=0; i<length; i++){
			System.out.print(intArray[i]+" ");
		}
	}

}