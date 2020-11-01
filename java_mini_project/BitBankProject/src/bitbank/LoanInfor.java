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
		loanBalance = loanAmount-(int)(loanAmount*SHORT_INTEREST_RATE/12);
		return loanBalance;
	}
	
	// 장기 대출 잔액 반환 메서드
	int LongLoanBalance(int loanAmount) {
		loanBalance = loanAmount-(int)(loanAmount*LONG_INTEREST_RATE/5/12);
		return loanBalance;
	}
	
	// 대출 내역 확인 메서드
	void ShowLoanInfor() {
		System.out.println("성       함 : "+name);
		System.out.println("대출 기간 : "+loanPeriod);
		System.out.println("대출 금액 : "+loanAmount);
		
		if(loanPeriod.equals("1년")) {	// 단기 대출
			System.out.println("금       리 : "+SHORT_INTEREST_RATE);
			System.out.println("대출 잔액 : "+ShortLoanBalance(loanAmount));
			System.out.println("이자 잔액 : "+ShortLoanInterest(loanAmount));
			
		} else {						// 장기 대출
			System.out.println("금       리 : "+LONG_INTEREST_RATE);
			System.out.println("대출 잔액 : "+LongLoanBalance(loanAmount));
			System.out.println("이자 잔액 : "+LongLoanInterest(loanAmount));
		}
		
	}
	

}
