package SetConcepts;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class AccountExecution {
	static int a = 10;
	int b = 10;

	public static void main(String[] args) {
		AccountExecution meth = new AccountExecution();
		meth.method(45);
		// TODO Auto-generated method stub
		Account acc1 = new Account(9898989898L, "Karthik", "9090909090", "sk@gmail.com");
		Account acc2 = new Account(94598989898L, "Arunachalam", "8986898989", "ack@gmail.com");
		Account acc3 = new Account(94598989898L, "Gokulakannan", "8986898989", "ack@gmail.com");
		Set<Account> account = new LinkedHashSet<Account>();
		account.add(acc1);
		account.add(acc2);
		account.add(acc3);
		for (Account acc : account) {
			System.out.println(acc);
		}
		LinkedList<Account> accounts = new LinkedList<Account>(account);
		System.out.println("-----------------------");
		Collections.sort(accounts);
		for (Account acc : accounts) {
			System.out.println(acc);
		}
	}

	public void method(int a) {
		this.a = a;
		int b = 30;
		System.out.println(a);
		System.out.println(b);
	}

}
