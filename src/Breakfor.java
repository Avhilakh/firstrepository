
public class Breakfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int x = 4;
		for(int i=1; i<=num; i++) {
			if(num%x==0) {
				break;
			}
			x = x+1;
		}
		System.out.println(x);
	}

}
