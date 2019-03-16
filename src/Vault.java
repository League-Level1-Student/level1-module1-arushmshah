
public class Vault {
	
	//1. We need a Vault object that contains a secret code.
	int secretCode = 15489;
	
//	It also contains a tryCode() method that takes a number as a parameter and returns true if that number opens the vault, false otherwise.
	
	
	boolean trycode(int number){
		if(number==secretCode) {
		return true;
			
		}
	}
	
	
//	2. Test the vault object using a main method.
	
	public static void main(String[] args) {
		
	}


}
