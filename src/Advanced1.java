
public class Advanced1 {
	String nstr = "";
	int distance(char ch) {
		int dis = ch-'D';
		return dis;
	}
	char opp(char ch) {
		char opch = (char)(ch+32);
		return opch;
	}
	String shifted(String str, int n) {
		int len = str.length();
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			int sum = ch+n;
			if(sum>122) {
				int m = 97+((sum-97)%26);
				char ch1 = (char)m;
				nstr = nstr + ch1;
			}
			else {
				char ch2 = (char)sum;
				nstr = nstr + ch2;
			}
			
		}
		return nstr;
	}
		static public void main(String[] args) {
		Advanced1 obj = new Advanced1();
		int res = obj.distance('d');
		//System.out.println(res);
		char resch = obj.opp('D');
		//System.out.println(resch);
		String zstr = obj.shifted("xmas", 4);
		System.out.println(zstr);
	}

}
