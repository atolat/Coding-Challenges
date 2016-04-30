		public class app {
			public static void main(String[] args) {
				StringBuffer s = new StringBuffer("9,99,9,99");
				int result=0;
				System.out.println("Input String: "+s);
				int i,j,w;
				i=j=w=0;
				while(i<s.length()){
					if(s.charAt(i)== ',' || i == s.length()-1){
						j=i-1; //j will represent the last index of the word, subtract one to account for the space
						if(i==s.length()-1){
						j=i;
						}
						result=result+returnPrimitive(s,w,j);
						w=i+1;
					} 
					i++;
				}
				System.out.println(result);
			}
		
			private static int returnPrimitive(StringBuffer s,int w, int j) {
				String s1="";
				while (w<=j){
					s1=s1.concat(s.charAt(w)+"");
					w++;
				}
				return Integer.parseInt(s1);
				
			}
		
		}
