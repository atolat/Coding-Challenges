import java.util.LinkedHashSet;
import java.util.Set;

public class app {
	public static void main(String[] args) {
		String s = "Test Input";
		int n=1; // n to find repeated character at
		Set<Character> dupset= new LinkedHashSet<Character>();
		int b=0;
		for(int i=0;i<s.length();i++){
			Character c= (Character)s.charAt(i);
			dupset.add(c);
			Character c1=c;
				if(c1==c){
				b++;	
				}if(b==n){
					System.out.println(c1);
				}
		}
		System.out.println(dupset);
	}
}
