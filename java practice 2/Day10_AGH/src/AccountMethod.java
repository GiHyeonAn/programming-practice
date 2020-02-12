
public class AccountMethod {

	public static void main(String[] args) {
		
//		4. AccountMain이라는 클래스를 생성. (메인메서드 포함)
//	     메인 메서드에서 실제 계좌(객체)를 생성 후 (예금주 이름: 홍길동, 비밀번호: 1234)
//	    3600원이 들어있는 계좌에서 800원 입금, 1900원 출금,
//	     마지막으로 잔액 조회까지 실행해 보세요.
		
		Account aAccount = new Account("홍길동", 1234, 3600);
		
		aAccount.deposit(800);
	    aAccount.withdraw(1900, 1234);
	      
	    int bal = aAccount.getBalance();
	    System.out.println("현재 잔액은 " + bal + "입니다");

	}

}
