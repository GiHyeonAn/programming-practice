package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class LottoSimulator {
	
	static Random r = new Random();
	
	static int prize1 = 0; //1등 당첨횟수를 저장할 변수
	static int prize2 = 0; //2등 당첨횟수를 저장할 변수
	static int prize3 = 0; //3등 당첨횟수를 저장할 변수
	static int prize4 = 0; //4등 당첨횟수를 저장할 변수
	static int prize5 = 0; //5등 당첨횟수를 저장할 변수
	static int prize6 = 0; //꽝 당첨횟수를 저장할 변수
	static int failcut = 0; //1등 당첨횟수를 저장할 변수
	
	
	
	
	//로또번호를 생성하는 메서드
	public static int[] createLotto() {
		
		int[] lotto = new int[6];
		int i = 0;
		while(i < 6) {
			boolean flag = false;
			int rn = r.nextInt(45) + 1;
			for(int j=0;j<=i;j++) {
				if (rn == lotto[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				lotto[i] = rn;
				i++;
			}
			
		}
		Arrays.sort(lotto);
		return lotto;
	}
	
	//보너스번호를 생성하는 메서드
	public static int createBonusNum(int[] win) {
		int bonus;
		while (true) {
			boolean flag = false;
			int rn = r.nextInt(45) + 1;
			for(int num : win) {
				if(rn == num) {
					flag = true;
					break; //inner for break;
				}
			}
			if(!flag) {
				bonus = rn;
				break; // while break;
			}
		}
		return bonus;
		
	}
	
	//번호 일치 여부를 알려주는 메서드
	public static void checkLottoNumber(int[] myLotto, int[] win,int bonus) {
		int count = 0;
		
		for (int i : myLotto) {
			for(int j : win) {
				if(i == j) {
					count++;
					break; //inner for
				}
			}
		}
		
		if(count == 6) {
			prize1++;
		} else if (count == 5) {
			boolean flag = false;
			for (int n : myLotto) {
				if(bonus == n) {
					prize2++;
					flag = true;
					break;
				}
			}
			if(!flag) prize3++;
		} else if (count == 4) prize4++;
		else if (count == 3) prize5++;
		else failcut++;
		
		
	}
	
	public static void main(String[] args) {
		
		//당첨 번호 배열을 생성
		int[] win = createLotto();
		//보너스 번호 생성
		int bonus = createBonusNum(win);
//		int[] myLotto = createLotto();
//		
//		System.out.println(Arrays.toString(win));
//		System.out.println(Arrays.toString(myLotto));
//		System.out.println(bonus);
		
		int paper = 0;//로또구매횟수
		
		while (true) {
			//내 로또 번호 생성
			int[] myLotto = createLotto();
			paper++;
			checkLottoNumber(myLotto, win, bonus);
			long money = 0;
			
			if(prize1 == 1) {
				System.out.println();
				System.out.println("1등에 당첨되었습니다");
				System.out.println("1등에 1번 당첨될 때 까지의 누적 당첨 현황");
				System.out.printf("1등 당첨 횟수(%.8f%%) : %d회\n", (prize1/(double)paper)*100, prize1);
				System.out.printf("2등 당첨 횟수(%.8f%%) : %d회\n", (prize2/(double)paper)*100, prize2);
				System.out.printf("3등 당첨 횟수(%.8f%%) : %d회\n", (prize3/(double)paper)*100, prize3);
				System.out.printf("4등 당첨 횟수(%.8f%%) : %d회\n", (prize4/(double)paper)*100, prize4);
				System.out.printf("5등 당첨 횟수(%.8f%%) : %d회\n", (prize5/(double)paper)*100, prize5);
				System.out.printf("꽝 당첨 횟수(%.8f%%) : %d회\n", (failcut/(double)paper)*100, failcut);
				money = (long) paper*1000;
				System.out.println("로또 1등 되려고 당신이 쓴 액수 : " + money + "원");
				break;
			} else {
				System.out.printf("로또 %d장째 구매중\n", paper);
			}
		}
		
		
	}

}
