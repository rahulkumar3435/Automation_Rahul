package FA_JavaProgram;

public class max_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int e=3;
		System.out.println(e);
		
		int A[]= {-1,3,4,-2,5,9};
		 int k=2;
		 int maxdif=0;
		 int c=Integer.MAX_VALUE;
		 
		 for (int i=0;i<A.length;i++)
		 {
			 for (int j=i;j<A.length;j++)
			 {
				 int mod=Math.abs(j-i);
				 
				 if (j>i && mod%k==0) {
					 int dif=Math.abs(A[i]-A[j]);
					 if (dif>maxdif) {
						 maxdif=dif;
					 }
				 }
			 }
				 
		 }
		 System.out.println(maxdif);

}
}
