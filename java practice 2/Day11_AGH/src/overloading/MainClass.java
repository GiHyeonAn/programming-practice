package overloading;

public class MainClass {

   public static void main(String[] args) {
      
      /*
       - Calculator 클래스에  CalcRectArea()메서드를 선언하여
       길이를 하나만 전달하면 정사각형의 넓이를 리턴, 길이를 두개 전달하면 (가로, 세로) 직사각형의 넓이를 리턴하도록
       오버로딩을 사용하여 메서드를 선언하세요
       MainClass 에서 직접 메서드 호출도 진행해 주세요
       */
      
      Calculator aCalculator = new Calculator();
      
      System.out.println("정사각형의 넓이 : " + aCalculator.CalcRectArea(5));
      System.out.println("직사각형의 넓이 : " + aCalculator.CalcRectArea(10,20));
      

   }

}