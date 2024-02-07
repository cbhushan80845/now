package searching;

public class ExampleSearching {
	public static  int search(int arr[] , int target) {
		 for(int i=0;i>arr.length;i++) {
			 if(arr[i]==target) 
			 return i;
		 }
		return target;
	 }

	public static void main(String[] args) {
		int arr[] = { 12, 22,23 };
		int target=12;
		int search = search(arr, target);
		if(search != -1) {
			System.out.println("Element found at index ::"+search);
		}else {
			System.out.println("Elent not found");
		}

	}

}
