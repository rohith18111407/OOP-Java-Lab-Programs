class factorial
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int fact=1;
		if((n==1)||(n==0))
		{
			System.out.println(fact);
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				fact*=i;
			}
			System.out.println(fact);
		}
	}
}			
