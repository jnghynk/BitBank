package bitbank;

import java.util.ArrayList;
import java.util.List;

public class TEST {
	
	public static void main(String[] args) {
		
		System.out.println(ShortLoanInterest(loanAmount));
		
		
		
		
		
		
		
		
		
	}
	
	static long loanAmount = 100;
	static long loanBalance = 0;
	static long interest = 0;
	
	// 단기 대출 이자 반환 메서드
	static long ShortLoanInterest(long loanAmount) {
		interest = (int)(loanAmount*0.07/12*100);
		return interest;
	}
}
