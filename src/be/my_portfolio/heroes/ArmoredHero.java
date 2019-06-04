package be.my_portfolio.heroes;

public class ArmoredHero extends Hero {
	ArmoredHero(){
		super();
	}
	
	ArmoredHero(String name){
		this.setName(name);
	}
	
	ArmoredHero(String name, int age){
		this.setName(name);
		this.setAge(age);
	}

	@Override
	public void useSuperPower() {
		System.out.println(getName() + " uses " + getSuperpower());
	}

	@Override
	public String toString() {
		return "ArmoredHero [Alias = " + getAlias() + ", Name = " + getName() + ", Age = " + getAge()+ "]";
	}
	
	
}
