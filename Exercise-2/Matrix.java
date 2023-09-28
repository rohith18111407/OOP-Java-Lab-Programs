import java.util.Scanner;
class Matrix
{
	void create_matrix()
	{
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter the no. of rows of the matrix 1: ");
		int rows1=scanner.nextInt();
		System.out.println("Enter the no. of columns of the matrix 1: ");
		int columns1=scanner.nextInt();
		int [][]mat1=new int[rows1][columns1];
		System.out.println("Enter the elements for matrix 1: ");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<columns1;j++)
			{
				System.out.println("Enter element["+(i+1)+(j+1)+"]: ");
				mat1[i][j]=scanner.nextInt();
			}
		}

		System.out.println("Enter the no. of rows of the matrix 2: ");
		int rows2=scanner.nextInt();
		System.out.println("Enter the no. of columns of the matrix 2: ");
		int columns2=scanner.nextInt();
		int [][]mat2=new int[rows2][columns2];
		System.out.println("Enter the elements for matrix 2: ");
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<columns2;j++)
			{
				System.out.println("Enter element["+(i+1)+(j+1)+"]: ");
				mat2[i][j]=scanner.nextInt();
			}
		}

		System.out.println("Matrix 1: ");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<columns1;j++)
				System.out.print(mat1[i][j]+" ");
			System.out.println();
		}

		System.out.println("Matrix 2: ");
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<columns2;j++)
				System.out.print(mat2[i][j]+" ");
			System.out.println();
		}

		System.out.println("Matrix addition: ");
		if(rows1==rows2 && columns1==columns2)
		{
			int [][]add=new int [rows1][columns1];
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<columns1;j++)
					add[i][j]=mat1[i][j]+mat2[i][j];
			}
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<columns1;j++)
					System.out.print(add[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.println("Cannot perform matrix addition...");

		System.out.println("Matrix subtraction: ");
		if(rows1==rows2 && columns1==columns2)
		{
			int [][]sub=new int [rows1][columns1];
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<columns1;j++)
					sub[i][j]=mat1[i][j]-mat2[i][j];
			}
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<columns1;j++)
					System.out.print(sub[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.println("Cannot perform matrix subtraction...");

		System.out.println("Matrix multiplication: ");
		if(rows2==columns1)
		{
			int [][]mul=new int [rows1][columns2];
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<columns2;j++)
				{
					mul[i][j]=0;
					for(int k=0;k<rows2;k++)
						mul[i][j]+=mat1[i][k]*mat2[k][j];
				}		
			}
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<columns2;j++)
					System.out.print(mul[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.println("Cannot perform matrix multiplication...");
	}
}

class Main
{
	public static void main(String[] args)
	{
		Matrix matrix=new Matrix();
		matrix.create_matrix();
	}
}