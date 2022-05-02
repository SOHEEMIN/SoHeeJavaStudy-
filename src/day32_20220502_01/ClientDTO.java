package day32_20220502_01;

public class ClientDTO {
	private Long id;
	private String clientName;
	private int clientPass;
	private String clientCreateDate;
	private int balance = 0;
	private int accountNumber;

	ClientDTO() {
	}

	public ClientDTO(Long id, String clientName, int clientPass, String clientCreateDate, int balance,
			int accountNumber) {
		this.id = id;
		this.clientName = clientName;
		this.clientPass = clientPass;
		this.clientCreateDate = clientCreateDate;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getClientPass() {
		return clientPass;
	}

	public void setClientPass(int clientPass) {
		this.clientPass = clientPass;
	}

	public String getClientCreateDate() {
		return clientCreateDate;
	}

	public void setClientCreateDate(String clientCreateDate) {
		this.clientCreateDate = clientCreateDate;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "ClientDTO [id=" + id + ", clientName=" + clientName + ", clientPass=" + clientPass
				+ ", clientCreateDate=" + clientCreateDate + ", balance=" + balance + ", accountNumber=" + accountNumber
				+ "]";
	}

}
