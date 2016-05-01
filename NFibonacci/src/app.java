
public class app {
	static int a=-1;
	static int b=1;
	static int c=0;
	public static void main(String[] args) {
		int n = 5; //nth number to calculate fibonacci
		System.out.println(calculateNthFibonacci(n));
	}

	private static int calculateNthFibonacci(int n) {
		if(n==0){
			return c;
		} else{
			c=a+b;
			a=b;
			b=c;
			return calculateNthFibonacci(n-1);
		}
	}
}
