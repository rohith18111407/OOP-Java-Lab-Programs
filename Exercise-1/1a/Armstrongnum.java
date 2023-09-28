class Armstrongnum
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int num=n,digit=0,sum=0;
		while(num!=0)
		{
			digit=num%10;
			sum+=digit*digit*digit;
			num/=10;
		}
		if(sum==n)
		{
			System.out.println(n+" is an Armstrong number");
		}
		else
		{
			System.out.println(n+" is not an Armstrong number");
		}
	}
}
