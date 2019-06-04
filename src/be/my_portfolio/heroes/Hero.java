package be.my_portfolio.heroes;

public abstract class Hero {
	// The properties that every hero has
	private String alias, name, superpower;
	private int age;
	
	/**
	 * Use the given superpower of the hero.
	 */
	public abstract void useSuperPower();

	/**
	 * @return The alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias - The alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name - The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return The superpower
	 */
	public String getSuperpower() {
		return superpower;
	}

	/**
	 * @param superpower - The superpower to set
	 */
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}

	/**
	 * @return The age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age - The age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
