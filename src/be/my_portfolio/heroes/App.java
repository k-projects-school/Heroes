package be.my_portfolio.heroes;

public class App {

	public static void main(String[] args) {
		// New instance of AllTheHeroes.
		AllTheHeroes list = new AllTheHeroes();
		
		// Armored hero instance.
		ArmoredHero armored = new ArmoredHero("Johan", 36);
		armored.setAlias("Armor");
		armored.setSuperpower("FMJ bullets");
		
		// Energizer hero instance.
		Energizer energizer = new Energizer("Dirk", 40);
		energizer.setAlias("Energize");
		energizer.setSuperpower("Energize");
		
		// Tank hero instance.
		Tank tank = new Tank("Pieter", 32);
		tank.setAlias("Tank");
		tank.setSuperpower("High defence");
		
		// Shapeshifter instance.
		Shapeshifter shapeshifter = new Shapeshifter("Sarren", 25);
		shapeshifter.setAlias("Shapeshifter");
		shapeshifter.setSuperpower("Change appereance");
		
		// Add the super heroes to the list.
		list.addSuperHeroes(armored, energizer, tank, shapeshifter);
		
		// Print the header.
		printHeader();
		// Print some lines.
		fancyLines();
		// Loop through the heroes list.
		for (Hero hero: list.heroes.values()) {
			// Print the hero.
			print(hero);
			// Use the super power of the hero.
			hero.useSuperPower();
			// print some lines.
			fancyLines(2);
		}

	}
	
	/**
	 * Print the hero.
	 * 
	 * @param hero
	 */
	private static void print(Hero hero) {
		System.out.println(hero);
	}
	
	/**
	 * Print the header.
	 */
	private static void printHeader() {
		System.out.println("Welcome to the mighties heroes!!!");
	}
	
	/**
	 * Print 1 line.
	 */
	private static void fancyLines() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	/**
	 * Print the given amount of lines.
	 * 
	 * @param amount
	 */
	private static void fancyLines(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}

}
