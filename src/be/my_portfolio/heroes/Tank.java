package be.my_portfolio.heroes;

public class Tank extends Hero {
	Tank(){
		super();
	}
	
	Tank(String name){
		this.setName(name);
	}
	
	Tank(String name, int age){
		this.setName(name);
		this.setAge(age);
	}

	@Override
	public void useSuperPower() {
		System.out.println(getName() + " uses " + getSuperpower());
	}

	@Override
	public String toString() {
		return "Tank [Alias = " + getAlias() + ", Name = " + getName() + ", Age = " + getAge()+ "]";
	}
	
	
}
