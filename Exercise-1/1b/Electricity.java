import java.util.Scanner;

class Electricity
{
	int consumer_no;
	String consumer_name,type;
	double prev_month_reading,cur_month_reading,bill_amount;
	
	Electricity(int consumer_no,String consumer_name,String type,double prev_month_reading,double cur_month_reading)
	{
		this.consumer_no=consumer_no;
		this.consumer_name=consumer_name;
		this.type=type;
		this.prev_month_reading=prev_month_reading;
		this.cur_month_reading=cur_month_reading;
	}
	
	public void bill()
	{
		switch(type)
		{
			case "Domestic":
				if(cur_month_reading<=100)
					bill_amount=cur_month_reading*1.0;
				else if(cur_month_reading<=200)
					bill_amount=100*1.0+(cur_month_reading-100)*2.50;
				else if(cur_month_reading<=500)
					bill_amount=100*1.0+100*2.50+(cur_month_reading-200)*4.0;
				else
					bill_amount=100*1.0+100*2.50+300*4.0+(cur_month_reading-500)*6;
				break;
			case "Commercial":
				if(cur_month_reading<=100)
					bill_amount+=cur_month_reading*2.0;
				else if(cur_month_reading<=200)
					bill_amount=100*2.0+(cur_month_reading-100)*4.50;
				else if(cur_month_reading<=500)
					bill_amount=100*2.0+100*4.50+(cur_month_reading-200)*6.0;
				else
					bill_amount=100*2.0+100*4.50+300*6.0+(cur_month_reading-500)*7;
				break;
		}
		System.out.println(" Bill amount generated: "+bill_amount);
	}	
}

class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the consumer no.: ");
		int no=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the consumer name: ");
		String name=scanner.nextLine();
		System.out.println("Enter the type of EB connection [Domestic/Commercial] : ");
		String type=scanner.nextLine();
		System.out.println("Enter the previous month reading: ");
		double prev=scanner.nextDouble();
		System.out.println("Enter the current month reading: ");
		double cur=scanner.nextDouble();
		Electricity object=new Electricity(no,name,type,prev,cur);
		object.bill();
	}
}
		
