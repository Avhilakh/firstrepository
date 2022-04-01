import java.util.Scanner;

public class Breakfor1 {

	public static void main(String[] args) {
		int n;
		String str;
		String zstr = "";
		int[] arr = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array numbers");
		for(int i=0; i<4; i++) {
		arr[i] = sc.nextInt();
		}
		for(int i=0; i<4; i++) {
			n = arr[i];
			if(n%11==0) {
				
				break;
			}
			zstr = zstr + n + "#";
		}
		System.out.println(zstr);

	}

}
