package interviewPrep;

public class FindMissingNumber {
	
	public static int findMissingNumber( int[] num ,int n) {
		int totalSum=n*(n+1)/2;
		System.out.println("ye"+totalSum);
		int actualSum=0;
		for(int nums:num) {
			actualSum+=nums;
			
		}
		return totalSum-actualSum;
	}
	
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,8,9};
		int n=9;
		 int missingNumber = findMissingNumber(num, n);
	        System.out.println("Missing Number: " + missingNumber);
	}
	
}
