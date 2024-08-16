package PawanAgarwal;

public class PrintPyramid {

	public static void main(String[] args) {
		
		int n=50 ;
		int i;
		int j;
		//int k = j-i;
		
		for (i=0;i<=n;i++)
		{
			for (j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}
			
			for (int k = i;k>=0;k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
