package bitbank;

import java.util.Scanner;

public class JudgeQualification extends LoanInfor {
	
	int Balance;				// 계좌잔액
	String membership;			// 멤버십 등급

	// 생성자
	public JudgeQualification() {
		super();
	}
	
	Scanner sc = new Scanner(System.in);
	
	// 대출 가능 금액 출력 메서드
	void showPossibleAmound() {
		
		if(membership.equals("Platinum")) {							// 멤버십 등급이 플래티넘 이상일 경우 대출 가능
			if(Balance>=60000 && Balance<100000) {			// 6만원 <= 계좌잔액 < 10만원 
				System.out.println("최대 대출 가능 금액 : "/*+Balance*0.5*/);
			} else if(Balance>=100000 && Balance<200000) {	// 10만원 <= 계좌잔액 < 20만원 
				System.out.println("최대 대출 가능 금액 : "/*+Balance*0.7*/);
			} else if(Balance>=200000) {					// 계좌잔액 >= 20만원
				System.out.println("최대 대출 가능 금액 : "/*+Balance*0.9*/);
			}
			return;
		} else if(!membership.equals("Platinum")){	// 멤버십 등급이 플래티넘 미만일 경우 대출 불가능
			System.out.println("멤버십 등급이 Platinum 미만인 회원은 대출이 불가능합니다.");
			System.out.println("다시 메뉴로 이동합니다.");
			return;
		} 
		return;
	}
	
}
