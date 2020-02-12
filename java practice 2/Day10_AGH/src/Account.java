
public class Account {

	/*
    1. 멤버변수-
     예금주 이름 (name : String)
     비밀번호 (password : int)
     잔액 (balance : int) 를 선언하세요.
     
    2. 생성자 - 3가지 멤버변수를 모두 매개값으로 받아 초기화하는
     생성자를 선언하세요.
     
    3. 메서드 -
    입금 기능 메서드 (deposit : void, 매개값 int money)
    출금 기능 메서드 (withdraw : void, 매개값 int money)
    잔액 조회 메서드 (getBalance : int)
    
    4. AccountMain이라는 클래스를 생성. (메인메서드 포함)
     메인 메서드에서 실제 계좌(객체)를 생성 후 (예금주 이름: 홍길동, 비밀번호: 1234)
    3600원이 들어있는 계좌에서 800원 입금, 1900원 출금,
     마지막으로 잔액 조회까지 실행해 보세요.
    */
	
	String name;
	int password;
	int balance;
	
	Account(String aName, int aPassword, int aBalance) {
		name = aName;
		password = aPassword;
		balance = aBalance;
	}
	
	void deposit(int money) {
		
//      System.out.println(money + "입금");
      //or 
        balance += money;
        System.out.println(money + "입금");
   }
   
	void withdraw(int money, int pw) {
		if (pw == 1234) {
			balance -= money;
			System.out.println(money + "출금");
		} else {
			System.out.println("비밀번호가 다릅니다");
		}
//      System.out.println(money + "출금");
   //or
   }
   
	//void info() {
//   System.out.println("잔액은 " + 2500);
//}

	int getBalance() {
		return balance;
	}
}
