package CFaq;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

class Bank{
	
	int account;
	int balance;
    public void printDetails() {
    	System.out.println(account +" has balance "+ balance);
    }
}

public class MaxAcountBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		Bank b2=new Bank();
		Bank b3=new Bank();
		
		b1.account=10069586;
		b1.balance=34_000;
		
		b2.account=10069586;
		b2.balance=67_000;
		
		b3.account=10069586;
		b3.balance=98_000;
		
		List <Bank> allbank=new ArrayList<>();
		allbank.add(b1);
		allbank.add(b2);
		allbank.add(b3);
		
		//Iterator it=allbank.iterator();
		int maxBalance=Integer.MIN_VALUE;
		for (Bank x: allbank) {
			
			if (x.balance>maxBalance) {
				maxBalance=x.balance;
			}
			
		}
		System.out.println(maxBalance);
		
		
		
		
		

	}

}
