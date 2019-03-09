
public class CatRunner {
public static void main(String[] args) {
	Cat c = new Cat("BAD");
	c.meow();
	c.printName();
	for(int i =0; i<9; i++) {
	c.kill();
	}
}
}
