
public class Binarysearch {
public boolean Binarysearching(int n,int[] arr) {
	int left = 0;
	int right = arr.length;
	while(left<=right) {
		int mid = left + (right-left)/2;
		if(n>arr[mid]) {
			left = mid+1;
		}
		else {
			if(n<arr[mid]) {
			right = mid-1;
		}
		
		else {
			return true;
		}
		}
	}
	return false;
}
	public static void main(String[] args) {
		int[] arr1 = new int[100];
		for(int i=0;i<100;i++) {
			arr1[i] = i+5;
		}
		Binarysearch obj = new Binarysearch();
		boolean bool = obj.Binarysearching(1, arr1);
		System.out.println(bool);
	}

}
