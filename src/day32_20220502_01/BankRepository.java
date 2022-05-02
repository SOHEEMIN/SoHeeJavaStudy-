package day32_20220502_01;

import java.util.*;

public class BankRepository {
	static List<ClientDTO> clientList = new ArrayList<>();
	static List<BankDTO> bankList = new ArrayList<>();

	public boolean save(ClientDTO newJoin) {
		
		return clientList.add(newJoin);

	}

	public ClientDTO findById(int account, int balance) {
		ClientDTO post = null;
		for (int i = 0; i < clientList.size(); i++) {
			if (account == (clientList.get(i).getAccountNumber())) {
				post = clientList.get(i);
			}balance = (clientList.get(i).getBalance());
		}
		return post;
	}
	public List<ClientDTO>findAll() {
		return clientList;
	}
	public Long depositMoney(int accountNumber, int balance) {
		Long loginId = null;
		for (int i = 0; i<clientList.size();i++) {
			if(accountNumber == (clientList.get(i).getAccountNumber())) {
				loginId = clientList.get(i).getId();
			}balance = (clientList.get(i).getBalance());
		}
		return loginId;
	}
	
	
	
	
	
	
	
	
	
	
	
}
