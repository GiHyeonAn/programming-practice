import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		//배열의 복사
		//copyOf(원본배열, 복사할 길이)
		//copyOfRange(원본배열, 시작인덱스, 끝인덱스) : 끝인덱스는 미만으로 입력한다
		
		char[] arr1 = {'J','A','V','A'};
		char[] arr2 = Arrays.copyOf(arr1, 2);
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//배열 탐색
		//binarySearch(배열, 찾는값) : 전체 배열 항목에서 찾는 값이 있는 인덱스를 리턴
		//없는 값은 음수값으로 리턴된다
		
		int[] arr = {1, 3, 5, 7, 9};
		System.out.println(Arrays.binarySearch(arr, 9));
		
		//배열 정렬
		
		int[] arr4 = {35,256,46,22,11,26,399};
		Arrays.sort(arr4); //오름차 정렬
		System.out.println(Arrays.toString(arr4));
		
		//배열의 값을 비교
		//하나라도 틀리면 false
		System.out.println(Arrays.equals(arr1, arr2));
		
		
		
		
	}

}
