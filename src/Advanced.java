import java.sql.Array;
import java.util.Scanner;

public class Advanced {
	int countp=0;
	int countn=0;
	int countz=0;
	int[] arr = {4,3,-9,0,4,1};
	double[] narr = new double[3];
	public void average() {
		
		
		int len = arr.length;
		for(int i=0;i<len;i++) {
			int n = arr[i];
			if(n>0) {
				countp = countp+1;
			}
			if(n<0) {
				countn = countn+1;
			}
			if(n==0) {
				countz = countz+1;
			}
		}
		narr[0] = (double)(countp)/6;
		narr[1] = (double)(countn)/6;
		narr[2] = (double)(countz)/6;
		for(int i=0;i<3;i++) {
		System.out.println(narr[i]);		
		}
		
	}

	public static void main(String[] args) {
		Advanced obj = new Advanced();
		obj.average();
		//System.out.println(obj.arr[0]);

	}

}
