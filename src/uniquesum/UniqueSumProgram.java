package uniquesum;

public class UniqueSumProgram {
	
	int finalSum;
	boolean firstSumSame = false;
	boolean secondSumSame = false;
	boolean thirdSumSame = false;
	
	public int AddUniqueSum(int firstSum, int secondSum, int thirdSum)
	{
		
		if(firstSum == secondSum || firstSum == thirdSum)
		{
			firstSumSame = true;
			
		}
		
		if(secondSum == firstSum || secondSum == thirdSum)
		{
			secondSumSame = true;
			
		}
		
		if(thirdSum == firstSum || thirdSum == secondSum)
		{
			thirdSumSame = true;
			
		}
		
		
		
		if(firstSumSame == false)
		{
			finalSum += firstSum;
		}
		
		if(secondSumSame == false)
		{
			finalSum += secondSum;
		}
		
		if(thirdSumSame == false)
		{
			finalSum += thirdSum;
		}
		
		
		
		System.out.println("The final sum is: " + finalSum);
		return finalSum; 
		
		
	}

}
