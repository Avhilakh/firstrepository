import java.util.*;
public class Hashset2 {
	ArrayList<String> arraylist = new ArrayList<String>();
	public ArrayList<String> extractnum(HashSet<String> names){
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			int len = str.length();
			if(len>3) {
				arraylist.add(str);
			}
		}
		return arraylist;
		
	}

	public static void main(String[] args) {
		HashSet<String> hashlist = new HashSet<String>();
		hashlist.add("Rohan");
		hashlist.add("Ann");
		hashlist.add("Tripp");
		hashlist.add("Eli");
		Hashset2 obj = new Hashset2();
		System.out.println(obj.extractnum(hashlist));
	}

}
