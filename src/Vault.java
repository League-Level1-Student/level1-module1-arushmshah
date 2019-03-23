
public class Vault {
	
	//1. We need a Vault object that contains a secret code.
	int secretCode;
	public Vault(int secret) {
		secretCode=secret;
	}
	public Vault() {
		secretCode=15489;
	}
//	It also contains a tryCode() method that takes a number as a parameter and returns true if that number opens the vault, false otherwise.
	
	
	boolean trycode(int number){
		return (number==secretCode);
		
	}
	
	
//	2. Test the vault object using a main method.
	
	public static void main(String[] args) {
	  Vault v = new Vault(777777);
	  JamesBond jb = new JamesBond();
	  int a = JamesBond.findCode(v);
	  System.out.println(a);
	}


}
