package bitbank;

import java.util.Scanner;

public class LoanRepay extends LoanInfor {
	
	// 생성자
	public LoanRepay() {
		super();
	}
	
	Scanner sc = new Scanner(System.in);

	// 대출금 상환 메서드
	void LoanRepay() {
		
		int select = 0;
		
		while(true) {
			//상환 메뉴 선택
			System.out.println("상환하실 메뉴를 입력해주세요.");
			System.out.println("1. 이자 납입");
			System.out.println("2. 원리금 상환");
			System.out.println("3. 전액 상환");
			System.out.println(">> ");
			
			try {
				select = sc.nextInt();
				if(!(select>0 && select<4)) {
					Exception e = new Exception(String.valueOf(select));
					throw e;
				}
			} catch (Exception e1) {
				System.out.println("메뉴입력이 잘못되었습니다.");
				sc.nextLine();
				continue;
			}
			break;
		} // while end
			
		switch(select) {
			case 1 :	// 이자 납입
				System.out.println("이자납입test");
				System.out.println("총 대출 금액 : "+loanAmount);
				
				if(loanPeriod.equals("1년")) {	// 단기 대출 이자
					System.out.println("이번 달 이자 : "+ShortLoanInterest(loanAmount));
				} else {						// 장기 대출 이자
					System.out.println("이번 달 이자 :"+LongLoanInterest(loanAmount));
				}
				
				while(true) {
					System.out.println("1. 납입하기");
					System.out.println("2. 대출 메뉴로 돌아가기");
					select = 0;
					
					try {
						select = sc.nextInt();
						if(!(select>0 && select<3)) {
							Exception e = new Exception(String.valueOf(select));
							throw e;
						}
					} catch(Exception e) {
						System.out.println("메뉴입력이 잘못되었습니다.");
						sc.nextLine();
						continue;
					}
					break;
				}
				
				if(select == 1) {	// 이자 납입하기
					if(loanPeriod.equals("1년")) {	// 단기 대출 이자 납입
						System.out.println("대출 기간 : 단기 대출(1년)");
						System.out.println("총 대출 금액 : "+loanAmount);
						System.out.println("대출 잔액 : "+ShortLoanBalance(loanAmount));
						System.out.println("이자 납입이 완료되었습니다.");
					} else {						// 장기 대출 이자 납입
						System.out.println("대출 기간 : 장기 대출(5년)");
						System.out.println("총 대출 금액 : "+loanAmount);
						System.out.println("대출 잔액 : "+LongLoanBalance(loanAmount));
						System.out.println("이자 납입이 완료되었습니다.");
					}	// 납입 end
				} else {			// 대출 메뉴로 돌아가기
					return;
				}
				break;	// switch break
			case 2 :	// 원리금 상환
				System.out.println("원리금상환test");

				System.out.println("총 대출 금액 : "+loanAmount);
				
				if(loanPeriod.equals("1년")) {	// 단기 대출 원리금
					System.out.println("이번 달 원리금 : "+(loanAmount/12)+ShortLoanInterest(loanAmount));
				} else {						// 장기 대출 원리금
					System.out.println("이번 달 원리금 :"+(loanAmount/5/12)+LongLoanInterest(loanAmount));
				}
				
				while(true) {
					System.out.println("1. 상환하기");
					System.out.println("2. 대출 메뉴로 돌아가기");
					select = 0;
					
					try {
						select = sc.nextInt();
						if(!(select>0 && select<3)) {
							Exception e = new Exception(String.valueOf(select));
							throw e;
						}
					} catch(Exception e) {
						System.out.println("메뉴입력이 잘못되었습니다.");
						sc.nextLine();
						continue;
					}
					break;
				}
				
				if(select == 1) {	// 원리금 상환하기
					if(loanPeriod.equals("1년")) {	// 단기 대출 원리금 납입
						System.out.println("대출 기간 : 단기 대출(1년)");
						System.out.println("총 대출 금액 : "+loanAmount);
						System.out.println("대출 잔액 : "+ShortLoanBalance(loanAmount));
						System.out.println("원리금 상환이 완료되었습니다.");
					} else {						// 장기 대출 이자 납입
						System.out.println("대출 기간 : 장기 대출(5년)");
						System.out.println("총 대출 금액 : "+loanAmount);
						System.out.println("대출 잔액 : "+LongLoanBalance(loanAmount));
						System.out.println("원리금 상환이 완료되었습니다.");
					}	// 상환 end
				} else {			// 대출 메뉴로 돌아가기
					return;
				}
				break;	// switch break
			case 3 :	// 전액 상환
				System.out.println("전액상환test");
				
				System.out.println("총 대출 금액 : "+loanAmount);
				
				if(loanPeriod.equals("1년")) {	// 단기 대출 전액 상환
					System.out.println("상환하실 금액 : "+ShortLoanBalance(loanAmount));
				} else {						// 장기 대출 전액 상환
					System.out.println("상환하실 금액 : "+LongLoanBalance(loanAmount));
				}
				
				while(true) {
					System.out.println("1. 전액 상환하기");
					System.out.println("2. 대출 메뉴로 돌아가기");
					select = 0;
					
					try {
						select = sc.nextInt();
						if(!(select>0 && select<3)) {
							Exception e = new Exception(String.valueOf(select));
							throw e;
						}
					} catch(Exception e) {
						System.out.println("메뉴입력이 잘못되었습니다.");
						sc.nextLine();
						continue;
					}
					break;
				}
				
				if(select == 1) {	// 전액 상환하기
					if(loanPeriod.equals("1년")) {	// 단기 대출 전액 상환
						System.out.println("대출 기간 : 단기 대출(1년)");
						System.out.println("총 대출 금액 : "+loanAmount);
						System.out.println("전액 상환이 완료되었습니다.");
					} else {						// 장기 대출 전액 상환
						System.out.println("대출 기간 : 장기 대출(5년)");
						System.out.println("총 대출 금액 : "+loanAmount);
						System.out.println("전액 상환이 완료되었습니다.");
					}	// 상환 end
				} else {			// 대출 메뉴로 돌아가기
					return;
				}
				break;	// switch break
		}
		
	} // 대출금 상환 메서드 end
	

}
