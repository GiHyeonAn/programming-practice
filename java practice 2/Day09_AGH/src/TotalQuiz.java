import java.util.Scanner;

public class TotalQuiz {

   public static void main(String[] args) {
      
      System.out.println("***가위 바위 보 게임***");
      Scanner sc = new Scanner(System.in);
      System.out.println("코인을 투입해 주세요(넣으실 코인의 숫자를 입력해 주세요)");
      System.out.print("> ");
      int coin = sc.nextInt();
      while(true) {
         System.out.println("현재 코인 수 : " + coin);
         coin = coin - 1;
         System.out.println("----------------------");
         System.out.println("1. 가위바위보 게임 시작");
         System.out.println("2. 전적 보기");
         System.out.println("3. 코인 투입하기");
         System.out.println("4. 프로그램 종료");
         System.out.println("----------------------");
         System.out.print("> ");
         int ch = sc.nextInt();
         if (ch == 1) {
            System.out.println("가위, 바위 , 보 중에 하나를 입력하세요");
            System.out.println("게임을 끝내고 싶으시다면 '그만'이라고 입력하세요");
            System.out.print("> ");
            String rcp = sc.next();
            int rn = (int) (Math.random()*3 );
            if (rn == 0) {
               System.out.println("컴퓨터가 낸 것은 가위");
               System.out.println("----------------------");
               if (rcp == "가위") {
                  System.out.println("비겼습니다");
               } else if (rcp == "바위") {
                  System.out.println("이겼습니다");
               } else if (rcp == "보") {
                  System.out.println("졌습니다");
               }
            } else if (rn == 1) {
               System.out.println("컴퓨터가 낸 것은 바위");
               System.out.println("----------------------");
               if (rcp == "가위") {
                  System.out.println("졌습니다");
               } else if (rcp == "바위") {
                  System.out.println("비겼습니다");
               } else if (rcp == "보") {
                  System.out.println("이겼습니다");
               }
            } else if (rn == 2) {
               System.out.println("컴퓨터가 낸 것은 보");
               System.out.println("----------------------");
               if (rcp == "가위") {
                  System.out.println("이겼습니다");
               } else if (rcp == "바위") {
                  System.out.println("졌습니다");
               } else if (rcp == "보") {
                  System.out.println("비겼습니다");
               }
            }
         }else if (ch == 2) {
            System.out.println("***게임 결과***");
            System.out.println("이긴 횟수 : " );
            System.out.println("비긴 횟수 : " );
            System.out.println("진 횟수 : " );
         }else if (ch == 3) {
            System.out.println("코인을 넣어주세요");
            System.out.print("> ");
            int coin2 = sc.nextInt();
            coin = coin + coin2;
         }else if (ch == 4) {
            System.out.println("프로그램을 종료합니다. [y/n]");
            System.out.print("> ");

         }
      }
         
      //export java폴더 Runnable set Loaunch에서 파일 선택, 바탕화면 저장
      //S               선택 후 .exe입력      .을 입력      jar 에서 파일 선택 main에서 선택  상단 톱니바퀴버튼 클릭 저장
      
      
   }   

}