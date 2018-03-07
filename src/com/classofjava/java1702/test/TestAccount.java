package com.classofjava.java1702.test;

import com.classofjava.java1702.bank.Bank;
import com.classofjava.java1702.bank.Account;
import com.classofjava.java1702.bank.SavingAccount;
import com.classofjava.java1702.bank.CurrentAccount;
import com.classofjava.java1702.bank.AccountType;
import com.classofjava.java1702.bank.NoSuchAccountException;
import com.classofjava.java1702.bank.NagativeAmountException;
import java.util.List;
import java.util.ArrayList;

public class TestAccount {
	public static void main(String[] args) throws NagativeAmountException, NoSuchAccountException{
		
		List<Long> accountNoList = new ArrayList<>();
		
		Bank bank = new Bank("State Bank of India", 1000);
		accountNoList.add(bank.openAccount("James", AccountType.SAVING_ACCOUNT, 10_000));
		accountNoList.add(bank.openAccount("Joshua", AccountType.CURRENT_ACCOUNT, 20_000));
		
		/*List<Account> accountList = new ArrayList<>();
		Account ac1, ac2;
		ac1 = new SavingAccount("James", 10_000);
		ac2 = new CurrentAccount("Joshua", 20_000);
		
		accountList.add(ac1);
		accountList.add(ac2);*/
		/*((CurrentAccount)ac2).setPenalty(Penalty.percent(0.5));*/
		
		bank.withdraw(accountNoList.get(0), 1_000);
		bank.withdraw(accountNoList.get(1), 15_000);
		
		bank.listAccount();
		bank.printPassbook(accountNoList.get(0));
		bank.printPassbook(accountNoList.get(1));
		
		bank.closeAccount(accountNoList.get(0));
		System.out.println("After closing Joshua account");
		bank.listAccount();
		//ac1.withdraw("Withdraw", 1_000);
		//ac1.display();
		//ac1.printPassbook();
		
		//ac2.withdraw("Withdraw", 15_000);
		//ac2.display();
		//ac2.printPassbook();
		
		/*accountList.forEach( (account) -> {
			account.display();
			account.printPassbook();
		});*/
		//Account :: display);
	}
}