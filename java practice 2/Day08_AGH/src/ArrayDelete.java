import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9,11,13};
		
//		arr[3] = arr[4];
//		arr[4] = arr[5];
//		arr[5] = arr[6];
//		arr[6] = arr[7]; x
		
		for (int i = 3; i <arr.length-1; i++) {
			arr[i] = arr[i+1];	
		}
		System.out.println(Arrays.toString(arr));
		
		int[] temp = new int[arr.length-1];
		
//		temp[0] = arr[0];
//		temp[1] = arr[1];
//		temp[2] = arr[2];
		
		for(int j= 0; j < temp.length; j++) {
			temp[j] = arr[j];
		}
		System.out.println(Arrays.toString(temp));
		
		System.out.println(arr);
		System.out.println(temp);
		
		arr = temp;
		temp = null;
		
		System.out.println(Arrays.toString(arr));
		
		


	}

}
