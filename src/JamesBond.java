
public class JamesBond {

	
public static int findCode(Vault bond){
	
	for(int i =0; i<10000000; i++) {
		boolean flag=bond.trycode(i);
		if(flag) {
			return i;
		}
	}
	return -1;
}
}
