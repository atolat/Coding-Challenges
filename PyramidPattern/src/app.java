
public class app {
public static void main(String[] args) {
	int n=4;  //Number to generate pyramid pattern
	
	for(int i=n;i>=0;i--){
		for(int j=0;j<=2*n;j++){
			if(j>=i && (i+j+1)<(n*2)){
				System.out.print("*");
			}else
				System.out.print(" ");
		}System.out.println("");
	}
}
}
