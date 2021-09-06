
public class BubbleSort implements SortStrategy{
	long endTime = 0;
	long startTime = System.currentTimeMillis();
	@Override
	public long[] sort(long popcount[])
	{
	   for (int i = (popcount.length - 1); i >= 0; i--)
	   {
	      for (int j = 1; j <= i; j++)
	      {
	         if (popcount[j-1] > popcount[j])
	         {
	              long temp = popcount[j-1];
	              popcount[j-1] = popcount[j];
	              popcount[j] = temp;
	         } 
	       } 
	    }
	   endTime = System.currentTimeMillis();
	   return popcount;
	}
	
	@Override
	public long getSortTime() {
		long totalMsecs = (endTime - startTime);
		return totalMsecs;
	}
	
	@Override
	public String strategyName() {
		return "Bubble    Sort";
	}
		
}