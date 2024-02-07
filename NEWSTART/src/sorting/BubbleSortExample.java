package sorting;

public class BubbleSortExample {
	public static void bublleSort(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
			
		}
	}
	public static void main(String[] args) {
		int arr[]= {7,8,3,1,2};
		bublleSort(arr, 5);
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
	

}
