package banking.array;

public class Account {
	//필드
	private String ano;//계좌번호
	private String owner;//계좌주
	private int balance;//잔고
	
	//생성자
	public Account(String ano,String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public void setAno(String ano) {
		this.ano = ano; 
	}
	public void setOwner(String owner) {
		this.owner = owner; 
	}
	public void setBalance(int balance) {
		this.balance = balance; 
	}
	
	public String getAno() {
	 			return ano;
	}
	public String getOwner() {
			return owner;
}
	public int getBalance() {
		return balance;
}
	
}

