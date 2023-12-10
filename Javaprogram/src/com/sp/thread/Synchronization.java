package com.sp.thread;

public class Synchronization {
	public static void main(String[] args) {
		Account acc=new Account();
		new AccountThread(acc);
		
	}

} class Account {
	int bal=970;
	public void withdraw(int amt) {
		if(bal>=amt) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw "+bal);
			try {
				Thread.sleep(1200);
			}catch(Exception ex){}
			bal-=amt;
			System.out.println(Thread.currentThread().getName()+" is completed withdraw...: "+bal);

		}
		else {
			System.out.println("No Funds for "+Thread.activeCount());
		}
	}
	public int getbalance() {
		return bal;
	}
}
class AccountThread implements Runnable{
	Account acc=null;
	AccountThread(Account acc){
		this.acc=acc;
		Thread t1=new Thread(this,"A");
		Thread t2=new Thread(this,"B");
		t1.start();
		t2.start();
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			acc.withdraw(225);
			if(acc.getbalance()<0) {
				System.out.println("Amount is Overdrawn......");
			}
		}
	}
	
}


