import java.util.Scanner;

public class Nestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		String zstr = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Value of n");
		n = sc.nextInt();
		int num = n;
		for(int i=1; i<=n; i++) {
			String str = "";
			for(int j=i; j<=num; j++) {
			
			str = str + j + "$";
			
			}
			num = num+2;
			//str = str + "$";
			System.out.println(str);

		}
		
	
		

	}

}
