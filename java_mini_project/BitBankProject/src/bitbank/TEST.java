package bitbank;

import java.util.ArrayList;
import java.util.List;

public class TEST {
	
	public static void main(String[] args) {
		
		System.out.println(loanAmount);
		
		
		
		System.out.println(LoanBalance(loanAmount));
		
		System.out.println(100-(int)(100*0.03/12*100));
		
		
		
		
		
		
		
		
		
	}
	
	static long loanAmount = 100;
	static long loanBalance = 0;
	
	// 장기 대출 잔액 반환 메서드
	static long LoanBalance(long loanAmount) {
		loanBalance = loanAmount;
		loanBalance -=(int)(loanAmount*0.03/12*100);
		return loanBalance;
	}
}
