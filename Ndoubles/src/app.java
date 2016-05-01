
public class app {
	static int a=1;
	static int b=0;
	//static int c=0;
	public static void main(String[] args) {
		int n = 4; //nth number to calculate double
		System.out.println(calculateNthDouble(n));
	}

	private static int calculateNthDouble(int n) {
		if(n==1){
		return b;
		} else{
			b=2*a;
			a=b;
			return calculateNthDouble(n-1);
		}
	}
}
