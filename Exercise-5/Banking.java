import java.util.Scanner;

class PANRequiredException extends Exception
{
	PANRequiredException()
	{
		super("PAN required for transcation of amount more then 25,000");
	}
}

class MinBalRequiredException extends Exception
{
	MinBalRequiredException()
	{
		super("Balance less than min. required balance for withdrawal");
	}
}


class NotEnougMoneyInAccountException extends Exception
{
	NotEnougMoneyInAccountException()
	{
		super("Withdrawal amount exceeded current balance");
	}
}

class PANFormatMismatchException extends Exception
{
	PANFormatMismatchException()
	{
		super("Invalid PAN");
	}
}

class BranchNotFoundException extends Exception
{
	BranchNotFoundException()
	{
		super("Invalid Branch");
	}
}

class AccountNotFoundException extends Exception
{
	AccountNotFoundException()
	{
		super("Account not found");
	}
}


class Account
{
	private String name;
	private int account_num;
	private String branch;
	private int balance;
	private String pan;
	
	public String branches[]= new String[] {"Tiruppur","Coimbatore","Thoothukudi","Chennai"};

	public Account(String name, int account_num, int balance) 
	{
		this.name = name;
		this.account_num = account_num;
		this.balance = balance;
		this.pan = "Null";
	}
	
	public int setBranch(String branch) throws BranchNotFoundException
	{
		for(String b : this.branches)
		{
			if (branch.equals(b))
			{
				this.branch = branch;
				return 1;
			}
		}
		this.branch = "Null";
		throw new BranchNotFoundException();
	}
	public void setPAN(String pan) throws PANFormatMismatchException
	{
		if(this.panValidity(pan))
			this.pan = pan;
		else 
			throw new PANFormatMismatchException();
	}
	
	public Account(String name, int account_num, int balance, String pan) throws PANFormatMismatchException
	{
		this(name, account_num, balance);
		setPAN(pan);
		
	}
	
	public int getBalance()
	{
		return this.balance;
	}

	public void deposit(int amount) throws PANRequiredException
	{
		if(amount > 25000)
		{	if(pan.equals("Null"))
			{
				throw new PANRequiredException();
			}
			else if(this.panValidity(pan))
			{
				this.balance = this.balance + amount;
			}
		}	
		else
			{
				//System.out.println("Less than 25k");
			   this.balance = this.balance + amount/2;
			}
	}
	
	public void withdraw(int amount) throws MinBalRequiredException, NotEnougMoneyInAccountException
	{
		if(balance<500)
			throw new MinBalRequiredException();
		if(amount>this.balance)
			throw new NotEnougMoneyInAccountException();
		else
			this.balance = this.balance - amount;
	}
	
	public void searchAccount(int accno) throws AccountNotFoundException
	{
		if(this.account_num == accno)
		{
			System.out.println("Account name :" + this.name);
			System.out.println("Account number :" + this.account_num);
			System.out.println("Account balance :" + getBalance());
			System.out.println("Branch :" + this.branch);
			System.out.println("PAN :" + this.pan);
		}
		
	}
	
	public boolean panValidity(String pan)
	{
		boolean t = true;
		if(pan.length() == 10)
		{
			for(int i=0; i<5; ++i)
			{
				char ch=pan.charAt(i);
				if(!(Character.isLetter(ch)))
					return false;
				else t=true;
			}
			for(int i=5; i<9; ++i)
			{
				char ch=pan.charAt(i);
				if(!(Character.isDigit(ch)))
					return false;
				else t = true;
			}
		    char ch=pan.charAt(9);
			if(!(Character.isLetter(ch))) return false;
			else t= true;
		}
		
		return t;
	}
}

class Main
{
	public static void main(String args[])
	{	
		//creating account
		String pan = "Null";
		String branch = "Null";

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name :");
		String name = scan.next();
		System.out.print("Enter account number :");
		int account_num = scan.nextInt();
		System.out.print("Enter balance :");
		int balance = scan.nextInt();
		System.out.print("Enter branch :");
		branch = scan.next();
				
		Account account = new Account(name, account_num, balance);

		try
		{
			account.setBranch(branch);
		}

		catch(BranchNotFoundException e)
		{
			System.out.print(e);
		}

		System.out.print("Enter amount to deposit :");
		int deposit= scan.nextInt();

		try
		{
		account.deposit(deposit);
		}
		catch(PANRequiredException e)
		{
			System.out.println(e);
			System.out.println("Enter PAN :");
			pan = scan.next();
		}

		try
		{
			account.setPAN(pan);
		}
		catch(PANFormatMismatchException e)
		{
			System.out.println(e);
		}
		
		try
		{
		account.deposit(deposit);
		}
		catch(PANRequiredException e)
		{
			System.out.println(e);
		}
		
		System.out.print("After deposit Balance : ");
		System.out.println(account.getBalance());

		System.out.print("Enter amount to withdraw :");
		int w = scan.nextInt();

		try {
			account.withdraw(w);
		}

		catch(MinBalRequiredException e)
		{
			System.out.println(e);
		}
		
		catch(NotEnougMoneyInAccountException e)
		{
			System.out.print(e);
		}

		System.out.print(" After withdrawal Balance : ");
		System.out.println(account.getBalance());
	}	
}