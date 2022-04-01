import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {
	public void auth(String username, String password, HashMap<String,String> givedetails) {
		if(givedetails.containsKey(username)) {
			System.out.println("Username Found");
			if(givedetails.get(username)==password) {
				System.out.println("Login Successfull");
			}
			else {
				System.out.println("Incorrect Password");
			}
		}
		else {
			System.out.println("Incorrect Username");
		}
		
	}
	public void update(String username, String password, HashMap<String,String> givedetails) {
		if(givedetails.containsKey(username)) {
			System.out.println("Found Username");
			System.out.println("Password upated");
			givedetails.put(username, password);
		}
		else {
			System.out.println("Not Found Username");
			System.out.println("Added Username");
			givedetails.put(username, password);
		}
		System.out.println(givedetails);
	}
	public void enrolled(HashMap<String,Integer> enrolled) {
		Set<String> keys = enrolled.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String astr = itr.next();
			int count = enrolled.get(astr);
			if(count>50) {
				System.out.println(astr);
			}
		}
	}

	public static void main(String[] args) {
		HashMap<String,String> details = new HashMap<String,String>();
		HashMap<String,Integer> countenroll = new HashMap<String,Integer>();
		details.put("Avhi", "124");
		details.put("Avhi2", "1234");
		Hashmap obj = new Hashmap();
		//obj.update("Avhi3", "1245", details);
		Set<String> keys = details.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String zstr = itr.next();
			String value = details.get(zstr);
			//System.out.println(zstr + "=" + value);
		}
		countenroll.put("Science", 55);
		countenroll.put("Arts", 10);
		countenroll.put("Maths", 60);
		obj.enrolled(countenroll);
	}

}
