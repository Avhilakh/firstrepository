
public class Binarystrsearch {
	public boolean binarystr(String str8, String[] arr1) {
		int left = 0;
		int right =arr1.length - 1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			
			if(str8.compareTo(arr1[mid])>0) {
				left = mid+1;
			}
			else {
				if(str8.compareTo(arr1[mid])<0) {
					right = mid-1;
				}
				else {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "aat";
		String str1 = "bat";
		String str2 = "cat";
		String str3 = "dat";
		String str4 = "eat";
		String str5 = "fat";
		String str6 = "gat";
		String str7 = "hat";
		String[] arr = {str,str1,str2,str3,str4,str5,str6,str7};
		Binarystrsearch obj = new Binarystrsearch();
		boolean bool = obj.binarystr("iat", arr);
		System.out.println(bool);
	}

}
