package static_.arrayprint;

public class ArrayPrint {
	
	private ArrayPrint() {}
	
	//5번 문제
	private static ArrayPrint ap = new ArrayPrint();
	
	public static ArrayPrint getInstance() {
		return ap;
	}
	
	public void printArray(String[] arr) {
		for(String s : arr ) {
			System.out.println(s + " ");
		}
		System.out.println();
	}

	public void printArray(int[] arr2) {
		for(int i : arr2 ) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	public void printArray(char[] arr3) {
		for(char c : arr3 ) {
			System.out.println(c + " ");
		}
		System.out.println();
	}
	
	
	
	

}
