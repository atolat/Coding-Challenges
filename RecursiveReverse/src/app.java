
public class app {
	public static void main(String[] args) {
		String s="Test String";
		String rev=recursiveRev(s);
		System.out.println(rev);
	}

	private static String recursiveRev(String s) {
		if(s.length()==1){
			return s;
		}
		return recursiveRev(s.substring(1))+s.charAt(0);
	}
}
