package ex_06;

public class Gecko {
	private String name;
	private int age;
	private int energy=100;
	
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void setName(String name) {
		this.name = name;
	}

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
	
	public void eat(String str) {
		if(str.equals("Meat")) {
			System.out.println("Yummy!");
			if(this.energy<=90)
				this.energy+=10;
			else
				this.energy=100;
		}
		else if(str.equals("Vegetable")) {
			System.out.println("Erk!");
			if(this.energy>=10)
				this.energy-=10;
			else this.energy=0;
		}
		else
			System.out.println("I can't eat this!");
	}
	
	public void work() {
		if(this.energy>=25)
			System.out.println("I'm working T.T");
		else if(this.energy<25) {
			System.out.println("Heyyy I'm too sleepy, better take a nap!");
			this.energy=50;
		}
	}
	public static void main(String[] args) {
		Gecko mimi = new Gecko("mimi");
		mimi.hello("Titi");
		mimi.hello(2);
		System.out.println(mimi.energy);
		mimi.eat("Vegetable");
		System.out.println(mimi.energy);
		mimi.eat("Vegetable");
		System.out.println(mimi.energy);
	}
}