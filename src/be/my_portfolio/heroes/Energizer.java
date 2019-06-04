package be.my_portfolio.heroes;

public class Energizer extends Hero {
	Energizer(){
		super();
	}
	
	Energizer(String name){
		this.setName(name);
	}
	
	Energizer(String name, int age){
		this.setName(name);
		this.setAge(age);
	}

	@Override
	public void useSuperPower() {
		System.out.println(getName() + " uses " + getSuperpower());
	}

	@Override
	public String toString() {
		return "Energizer [Alias = " + getAlias() + ", Name = " + getName() + ", Age = " + getAge()+ "]";
	}
	
	
}
