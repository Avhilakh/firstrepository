import java.util.Scanner;

public class Arrayuserinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Input Array Size");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Input Array");
		for(int j=0; j<n; j++) {
		arr[j] = sc.nextInt();
		
		}
		System.out.println("Printing Array");
		for(int j=0; j<n; j++) {
			System.out.println("Array index " + j + ":" + arr[j]);
		}
	}

}
