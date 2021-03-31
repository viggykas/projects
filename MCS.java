
public class MCS {
	
	//ALGORITHMS
	public static int BruteForceMCS(int [] nums1)
	{
		int n = nums1.length;
		int maximumSubArraySum = Integer.MIN_VALUE;
		
		for (int left = 0; left < n; left++) {
			
			for (int right = left; right < n; right++) {
				 int windowSum = 0;
				 
				 for (int k = left; k<=right; k++) {
					windowSum += nums1[k];
				 }
					maximumSubArraySum = Math.max(maximumSubArraySum, windowSum);
				}
			}
			return maximumSubArraySum;
		}

	public static int ImprovedMCS (int [] nums2)
	{
		int n = nums2.length;
		int maximumSubArraySum = Integer.MIN_VALUE;
		
		for (int left = 0; left < n; left++) {
			 int runningWindowSum = 0;
			 
			for (int right = left; right < n; right++) {
					runningWindowSum += nums2[right];
					maximumSubArraySum = Math.max(maximumSubArraySum, runningWindowSum);
				}
			}
			return maximumSubArraySum;
	}
	
	//ALGORITHM RETURNING A COUNTER
	public static int CounterBruteForceMCS(int [] nums1counter)
	{
		int count = 0;

		int n = nums1counter.length;
		int maximumSubArraySum = Integer.MIN_VALUE;
		
		for (int left = 0; left < n; left++) {
			
			for (int right = left; right < n; right++) {
				 int windowSum = 0;
				 
				 for (int k = left; k<=right; k++) {
					 windowSum += nums1counter[k];
					 count ++;
				 }
					maximumSubArraySum = Math.max(maximumSubArraySum, windowSum);
				}
			}
			return count;
		}
	
	public static int CounterImprovedMCS (int [] nums2)
	{
		int count = 0;
		
		int n = nums2.length;
		int maximumSubArraySum = Integer.MIN_VALUE;
		
		for (int left = 0; left < n; left++) {
			 int runningWindowSum = 0;
			 
			for (int right = left; right < n; right++) {
					runningWindowSum += nums2[right];
					maximumSubArraySum = Math.max(maximumSubArraySum, runningWindowSum);
					count ++;
				}
			}
			return count;
	}
	
	
	public static void main(String[] args) {
		
		int [] a = {-1,-2,-3,-4,-5,-6};
		int [] b = {-1,1,-1,1,-1,1};
		int [] c = {-1,2,3,-3,2};
		int [] d = {1,-5,2,-1,3};
		int [] e = {-2,2,-2,-2,3,2};
		
		
		//BRUTE FORCE OUTPUT
		System.out.println("The MCS using a Brute Force Algorithm is: ");
		
			System.out.println("a: " + BruteForceMCS(a) 
						  + "(With " + CounterBruteForceMCS(a) + " iterations)");
		
			System.out.println("b: " + BruteForceMCS(b)
						  + " (With " + CounterBruteForceMCS(b) + " iterations)");
						 
			System.out.println("c: " + BruteForceMCS(c)
						  + " (With " + CounterBruteForceMCS(c) + " iterations)");
						  
			System.out.println("d: " + BruteForceMCS(d)
						  + " (With " + CounterBruteForceMCS(d) + " iterations)");
						  
			System.out.println("e: " + BruteForceMCS(e)
						  + " (With " + CounterBruteForceMCS(e) + " iterations)");
		
		//IMPROVED OUTPUT
		System.out.println('\n' + "The MCS using an Improved Algorithm is: ");
		
			System.out.println("a: " + ImprovedMCS(a)
						  + "(With " + CounterImprovedMCS(a) + " iterations)");
			
			System.out.println("b: " + ImprovedMCS(b)
						  + " (With " + CounterImprovedMCS(b) + " iterations)");
			
			System.out.println("c: " + ImprovedMCS(c)
						  + " (With " + CounterImprovedMCS(c) + " iterations)");
			
			System.out.println("d: " + ImprovedMCS(d)
						  + " (With " + CounterImprovedMCS(d) + " iterations)");
			
			System.out.println("e: " + ImprovedMCS(e)
			  			  + " (With " + CounterImprovedMCS(e) + " iterations)");
							
	}
		
	

}