import java.util.Scanner;

public class Userinputexercise {

	public static void main(String[] args) {
		int n;
		int y =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Size");
		n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Input numbers");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		
		}
		int z=arr[0];
		for(int i=0; i<n; i++) {
			int x = arr[i];
			if(z>arr[i]) {
			
			z = arr[i];
			}
		
		}
		System.out.println(z);
		
		
	}

}
