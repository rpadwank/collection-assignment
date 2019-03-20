package com.capgemini.bank.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bank.model.SavingAccount;

public class SavingAccountTest {

	private SavingAccount savingAccount[];
	
	@Before
	public void setUp()
	{
		savingAccount = new SavingAccount[5];
		savingAccount[0] = new SavingAccount(101, "John", 30000, false);
		savingAccount[1] = new SavingAccount(102, "Anna", 25000, false);
		savingAccount[2] = new SavingAccount(103, "Molly", 800, true);
		savingAccount[3] = new SavingAccount(104, "Bob", 70000, true);
		savingAccount[4] = new SavingAccount(105, "Jane", 30000, true);
	}
	@Test
	public void testSavingAccountWithArrayList() {
		ArrayList<SavingAccount> savingAccountArrayList = new ArrayList<>();
		for(int i=0; i<5; i++)
		{
			savingAccountArrayList.add(savingAccount[i]);
		}
		
		Iterator<SavingAccount> iterator = savingAccountArrayList.iterator();
		for(int i=0; i<5; i++)
		{
			assertEquals(savingAccount[i], iterator.next());
		}
	}

	@Test
	public void testBankAccountListWithTreeSet() {
	
		
	}
	
}
