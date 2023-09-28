class Sumofnaturalnum
{
	public static void main(String[] args)
	{
		int sum=0;
		int num=Integer.parseInt(args[0]);
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("The Sum of first "+num+" natural numbers is: "+sum);
	}
}
