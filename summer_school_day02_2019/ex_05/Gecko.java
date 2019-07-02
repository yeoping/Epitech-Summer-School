package ex_05;

public class Gecko {
	private String name;
	private int age;

	public Gecko() {
		System.out.println("Hello!$");
		this.name = "Unknown$";
	}

	public Gecko(String name) {
		System.out.println("Hello " + name + "!$");
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void status() {
		switch (this.age) {
		case 0:
			System.out.println("Unborn Gecko");
			break;
		case 1:
		case 2:
			System.out.println("Baby Gecko");
			break;
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Adult Gecko");
			break;
		case 11:
		case 12:
		case 13:
			System.out.println("Old Gecko");
			break;
		default:
			System.out.println("Impossible Gecko");
		}
	}
	public void hello(String str) {
		System.out.println("Hello "+str+", I'm "+this.name+"!$");
	}
	
	public void hello(int some) {
		for(int i=0;i<some;i++)
			System.out.println("Hello,"+" I'm "+this.name+"!$");
	}
	public static void main(String[] args) {
		Gecko mimi = new Gecko("mimi");
		mimi.hello("Titi");
		mimi.hello(2);
	}
}