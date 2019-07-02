package ex_02;
/**
 * 
 * Constructor example
 *
 */
public class Gecko {
	private String name;
	
	public Gecko() {
		System.out.println("Hello!$");
		this.name="Unknown$";
	}
	public Gecko(String name) {
		System.out.println("Hello "+name+"!$");
		this.name=name+"$";
	}
	
	public static void main(String[] args) {
		Gecko arthur = new Gecko("Arthur");
		Gecko benjy = new Gecko();
		System.out.println(arthur.name);
		System.out.println(benjy.name);
	}
}