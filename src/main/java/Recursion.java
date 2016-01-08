
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(gcd(30, 42));
		System.out.println(gcd(48, 36));

	}
	
	
	public static void towersOfHonoi(){
		
	}
	
	public static int gcd(int num1, int num2){
		
		int rem = num1%num2;
		
		if(rem == 0 ){
			return num2;
		}
		return gcd(num2, rem);
		
	}

}
