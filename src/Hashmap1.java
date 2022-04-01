import java.util.*;
public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<String,Integer> mymap = new HashMap<String,Integer>();
		String[] strarr = {"ab","ba","ab","aba","ba","ab","ba","aba"};
		int len = strarr.length;
		int y = 1;
		for(int i=0;i<len;i++) {
			String nstr = strarr[i];
			if(mymap.containsKey(nstr)) {
				int n = mymap.get(nstr);
				n=n+1;
				mymap.put(nstr, n);
				
			}
			else {
				mymap.put(nstr, y);
			}
		}
		System.out.println(mymap);
	}

}
