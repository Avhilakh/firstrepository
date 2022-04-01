
public class Breakfor2 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int len = arr.length;
		int x = 0;
		String str ="";
		int min = arr[0];
		for(int i=0; i<len; i++) {
			int z = arr[i];
			if(z>=min) {
				min = z;
				str = "true";
			}
			else {
				str = "false";
				break;
			}
			
		}
		System.out.println(str);
	}

}
