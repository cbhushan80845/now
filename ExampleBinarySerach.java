package searching;

public class ExampleBinarySerach {
	public static int binaryExam(int arr[],int target) {
		
		int start=0;
		int end =arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(target==arr[mid]) {
				return mid;
				
			}else if (target>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
		
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {11,2,3,66,78,76,21};
		int binaryExam = binaryExam(arr, 76);
		System.out.println(binaryExam);
		
	}

}
