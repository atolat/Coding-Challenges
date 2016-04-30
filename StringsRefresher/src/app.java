
public class app {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("This is my test input string");
		System.out.println("Input String: "+s);
		int i,j,w;
		i=j=w=0;
		while(i<s.length()){
			if(s.charAt(i)== ' ' || i == s.length()-1){
				j=i-1; //j will represent the last index of the word, subtract one to account for the space
				if(i==s.length()-1){
				j=i;
				}
				swap(s,w,j);
				w=i+1;
			} 
			i++;
		}
		swap(s,0,s.length()-1);
		System.out.println("Reversed String: "+s);
		
	}

	private static void swap(StringBuffer s, int w, int j) {
		while (w<j){
			char c=s.charAt(w);
			s.setCharAt(w, s.charAt(j));
			s.setCharAt(j, c);
			w++;
			j--;
			//System.out.println(s);
		}
		
	}

}
