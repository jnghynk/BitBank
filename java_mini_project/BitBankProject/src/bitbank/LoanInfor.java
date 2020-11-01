package bitbank;

public class LoanInfor {
		
	String name;				// 고객 이름
	String account;				// 계좌
	String loanPeriod;			// 대출 기간
	int loanAmount;				// 대출금
	int loanBalance;			// 대출 잔액
	int balance;				// 계좌 잔액
	int interest;			// 이자
	
	public static final double SHORT_INTEREST_RATE=0.07;	// 단기 대출 금리
	public static final double LONG_INTEREST_RATE=0.03;		// 장기 대출 금리
	
	// 생성자
	LoanInfor(){
		
	}
	
	// 단기 대출 이자 반환 메서드
	int ShortLoanInterest(int loanAmount) {
		interest = (int)(loanAmount*SHORT_INTEREST_RATE/12);
		return interest;
	}
	
	// 장기 대출 이자 반환 메서드
	int LongLoanInterest(int loanAmount) {
		interest = (int)(loanAmount*LONG_INTEREST_RATE/5/12);
		return interest;
	}
	
	// 단기 대출 잔액 반환 메서드
	int ShortLoanBalance(int loanAmount) {
		balance = loanAmount-(int)(loanAmount*SHORT_INTEREST_RATE/12);
		return balance;
	}
	
	// 장기 대출 잔액 반환 메서드
	int LongLoanBalance(int loanAmount) {
		balance = loanAmount-(int)(loanAmount*LONG_INTEREST_RATE/5/12);
		return balance;
	}
	

}
