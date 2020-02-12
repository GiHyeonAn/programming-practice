
public class LoopNesting {

	public static void main(String[] args) {
		
		for(int dan=2; dan <= 9; dan++) {
			System.out.println("구구단" + dan + "단");
			System.out.println("------------------");
			
			for(int hang=1; hang<=9; hang++) {
				System.out.printf("%d x %d = %d\n", dan, hang, dan*hang);
			}//end inner
			System.out.println("------------------");
		}//end outer
		
		
		
		
		

	}

}
