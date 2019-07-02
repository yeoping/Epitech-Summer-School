package ex_08;

public class Gecko {
	private String name;
	private int age;
	private int energy = 100;

	public void fraternize(Object obj) {
		if (obj instanceof Gecko)
			if (this.energy >= 30 && ((Gecko) obj).getEnergy() >= 30) {
				System.out.println(this.getName()+":I'm going to drink with " + ((Gecko) obj).getName());
				System.out.println(((Gecko)obj).getName()+":I'm going to drink with " + this.getName());
			} else if (this.energy < 30 && ((Gecko) obj).getEnergy() < 30) {
				System.out.println("Not today!");
				System.out.println("Not today!");
			} else if (this.energy < 30)
				System.out.println("Sorry, " + ((Gecko) obj).getName() + ", I'm too tired to go out tonight.");
			else if (((Gecko) obj).getEnergy() < 30)
				System.out.println("Sorry, " + this.getName() + ", I'm too tired to go out tonight.");
			else if (obj instanceof Snake) {
				if (this.energy >= 10) {
					this.energy = 0;
					System.out.println("LET'S RUN AWAY !!!");
				} else {
					System.out.println("I'm dead...:(");
				}
			} else
				System.out.println("Oh! That's too bad , another time then !");
	}

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
		System.out.println("Hello " + str + ", I'm " + this.name + "!$");
	}

	public void hello(int some) {
		for (int i = 0; i < some; i++)
			System.out.println("Hello," + " I'm " + this.name + "!$");
	}

	public void eat(String str) {
		if (str.equals("Meat")) {
			System.out.println("Yummy!");
			if (this.energy <= 90)
				this.energy += 10;
			else
				this.energy = 100;
		} else if (str.equals("Vegetable")) {
			System.out.println("Erk!");
			if (this.energy >= 10)
				this.energy -= 10;
			else
				this.energy = 0;
		} else
			System.out.println("I can't eat this!");
	}

	public void work() {
		if (this.energy >= 25)
			System.out.println("I'm working T.T");
		else if (this.energy < 25) {
			System.out.println("Heyyy I'm too sleepy, better take a nap!");
			this.energy = 50;
		}
	}

	public static void main(String[] args) {
		Gecko mimi = new Gecko("mimi");
		Gecko mimi2 = new Gecko("mimi_sister");
		Snake snac = new Snake("snac");
		System.out.println(mimi2.equals(mimi));
		mimi.fraternize(mimi2);
		mimi.fraternize(snac);
	}
}