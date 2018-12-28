import java.lang.reflect.Array;
import java.util.Arrays;


public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 7, 4, 2, 6, 8, 11, 9, 10};
		
		System.out.println("Original Array = " + Arrays.toString(array));
		reverseArray(array);
		System.out.println("Reversed Array = " + Arrays.toString(array));
	}
	
	/* Reveres Array Method
	 * */
	private static void reverseArray(int[] array){
		
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2 ;
		
		for (int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
		
	}

}
