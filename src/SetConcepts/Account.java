package SetConcepts;

import java.util.Objects;

public class Account implements Comparable<Account> {
	private long account;
	private String name;
	private String phoneNo;
	private String email;

	public Account(long account, String name, String phoneNo, String email) {
		// TODO Auto-generated constructor stub
		this.account = account;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name : " + name + " ," + " Acc number : " + account + " , " + "PhoneNo : " + phoneNo + ", " + "Email : "
				+ email;

	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return this.phoneNo.compareTo(o.phoneNo);
	}

	public int hashcode() {
		return Objects.hash(email, phoneNo);

	}

	@Override
	public boolean equals(Object obj) {
		Account acc = (Account) obj;
		return this.phoneNo.equals(acc.phoneNo) && this.email.equals(acc.email);
	}

	@Override
	public int hashCode() {
		return email.hashCode() + phoneNo.hashCode();

	}

//	public boolean equals(Objects o) {
//		Account acc = (Account) o;
//		return this.phoneNo == acc.phoneNo;
//
//	}

	/*
	 * @Override public boolean equals(Object o) { if (this == o) return true; if (o
	 * == null || getClass() != o.getClass()) return false; Account contact =
	 * (Account) o; return Objects.equals(email, contact.email) &&
	 * Objects.equals(phoneNo, contact.phoneNo); }
	 */

}
