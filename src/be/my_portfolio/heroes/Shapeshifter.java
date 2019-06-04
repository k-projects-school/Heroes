package be.my_portfolio.heroes;

public class Shapeshifter extends Hero {
	Shapeshifter(){
		super();
	}
	
	Shapeshifter(String name){
		this.setName(name);
	}
	
	Shapeshifter(String name, int age){
		this.setName(name);
		this.setAge(age);
	}

	@Override
	public void useSuperPower() {
		System.out.println(getName() + " uses " + getSuperpower());
	}

	@Override
	public String toString() {
		return "Shapeshifter [Alias = " + getAlias() + ", Name = " + getName() + ", Age = " + getAge()+ "]";
	}
	
	
}
