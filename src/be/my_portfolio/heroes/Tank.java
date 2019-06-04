package be.my_portfolio.heroes;

public class Tank extends Hero {
	/**
	 * Constructor
	 */
	Tank(){
		super();
	}

	/**
	 * Constructor with the name set.
	 * 
	 * @param name - The name of the hero that needs to be set.
	 */
	Tank(String name){
		this.setName(name);
	}

	/**
	 * Constructor with the name and age set.
	 * 
	 * @param name - The name of the hero that needs to be set.
	 * @param age - The age of the hero that needs to be set.
	 */
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
