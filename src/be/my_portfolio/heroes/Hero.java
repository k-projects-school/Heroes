package be.my_portfolio.heroes;

public abstract class Hero {
	private String alias, name, superpower;
	private int age;
	
	public abstract void useSuperPower();

	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the superpower
	 */
	public String getSuperpower() {
		return superpower;
	}

	/**
	 * @param superpower the superpower to set
	 */
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
