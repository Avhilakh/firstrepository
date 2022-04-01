import java.util.*;


public class Arraylist {
	
	
	
	public void alleven(int[] arr1) {
		
		
	}
	public void twice(ArrayList<Integer> numbers1) {
		int len1 = numbers1.size();
		for(int i=0; i<len1; i++) {
			int num = numbers1.get(i);
			num = num*2;
			numbers1.set(i, num);
		}
		System.out.println(numbers1);
	}

	public static void main(String[] args) {
		Arraylist obj = new Arraylist();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int len = arr.length;
		for(int i=0; i<len; i++) {
				numbers.add(arr[i]);
		}
			//obj.alleven(arr);
			obj.twice(numbers);
		}
		

	

}
