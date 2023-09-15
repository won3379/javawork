package customers;

//상속을 위해서 필드의 접근제어자 - protected
//접근제어자가 생략된 필드는 default - 패키지 내부에서만 접근 가능
public class Customer {
	protected int customerId;		// 고객 아이디
	protected String customerName; 	// 고객 이름
	protected String customerGrade; // 고객 등급
	int bonusPoint; 		//보너스 포인트 
	double bonusRatio;	    //보너스 적립율
	
	//
		public Customer() {
		customerGrade = "SILVER"; //기본 등급
		bonusRatio = 0.01; 		  //1%
		}
		
		public Customer(int customerId, String customerName) {
			this.customerId = customerId;
			this.customerName = customerName;
			customerGrade = "SILVER"; 
			bonusRatio = 0.01; 		  
		}
		
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerName(String customerName) {//이름 입력
			this.customerName = customerName;
		}
		public String getCustomerName() {//이름 출력
			return customerName;
		}
		
		//보너스 포인트 =가격 x 보너스 적립율 
		public int calcPrice(int price) {
			bonusPoint+= (int)(price *bonusRatio);
			return price;
		}
		
		//정보 출력 메서드
		public String showCustomerInfo() {
			return customerName + "님의 등급은 " +customerGrade+
					"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
		}
	}

 
