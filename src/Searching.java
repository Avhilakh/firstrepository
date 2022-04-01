import java.util.ArrayList;

public class Searching {
	public boolean searchlist(String str, ArrayList<String> arr) {
		if(arr.contains(str)) {
		return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("helo");
		arr1.add("hi");
		arr1.add("world");
		Searching obj = new Searching();
		boolean bool = obj.searchlist("heloo", arr1);
		System.out.println(bool);
	}

}
