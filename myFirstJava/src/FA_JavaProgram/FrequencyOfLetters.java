package FA_JavaProgram;

class FrequencyOfLetters {

	public static void FrequencyOfLetters(String S) {
		
		S=S.toLowerCase();
		
		
		for (char i='a';i<='z';i++)
		{
			int count=0;
		  for(int j=0;j<S.length();j++)
		  {
			  
			 if(S.charAt(j)==i)
			 {
				count++ ;
			 }
			  
		  }
		  System.out.println("frequency of "+i+ " is "+count);
			
		}	
		}
		
	public static void main(String[] args) {
		
		String Str="This is Automation";
		 
		FrequencyOfLetters.FrequencyOfLetters(Str);

	}

}
