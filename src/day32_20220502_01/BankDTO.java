package day32_20220502_01;

public class BankDTO {
	private Long id;
	private int accountNumber;
	private int deposit;
	private int withdraw;
	private String bankDate;
	
	BankDTO(){
	}

	public BankDTO(Long id, int accountNumber, int deposit, int withdraw, String bankDate) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.bankDate = bankDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public String getBankDate() {
		return bankDate;
	}

	public void setBankDate(String bankDate) {
		this.bankDate = bankDate;
	}

	@Override
	public String toString() {
		return "BankDTO [id=" + id + ", accountNumber=" + accountNumber + ", deposit=" + deposit + ", withdraw="
				+ withdraw + ", bankDate=" + bankDate + "]";
	}
	
	
}
