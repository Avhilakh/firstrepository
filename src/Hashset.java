import java.util.*;
public class Hashset {
	HashSet<String> myset = new HashSet<String>();
	HashSet<Integer> myuniqueset = new HashSet<Integer>();
	public void replacedup(ArrayList<String> zstr) {
		int len = zstr.size();
		for(int i=0; i<len; i++) {
			String nstr = zstr.get(i);
			
			if(myset.contains(nstr)) {
				zstr.set(i, "Hello");
			}
			myset.add(nstr);
		}
		//System.out.println(zstr);
	}
	public void uniquelist(int[] A, int[] B) {
		int l1 = A.length;
		int l2 = B.length;
		for(int i=0;i<l1;i++) {
			int i1 = A[i];
			myuniqueset.add(i1);
		}
		for(int i=0;i<l2;i++) {
			int i2 = B[i];
			if(myuniqueset.contains(i2)) {
			System.out.println(i2);
			}
		}
		//System.out.println(myuniqueset);
	}
	public static void main(String[] args) {
		Hashset obj = new Hashset();
		String[] arr = {"mat","bad","cat","mat","cat","bat","mat"};
		ArrayList<String> strlist = new ArrayList<String>();
		int len1 = arr.length;
		for(int i=0;i<len1;i++) {
			String str = arr[i];
			strlist.add(str);
		}
		obj.replacedup(strlist);
		int[] firstarr = {2,1,3,5};
		int[] secondarr = {3,4,0,1,10};
		obj.uniquelist(firstarr,secondarr);
	}

}
