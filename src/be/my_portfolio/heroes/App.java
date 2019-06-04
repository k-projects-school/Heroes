package be.my_portfolio.heroes;

public class App {

	public static void main(String[] args) {
		AllTheHeroes list = new AllTheHeroes();
		
		ArmoredHero armored = new ArmoredHero("Johan", 36);
		armored.setAlias("Armor");
		armored.setSuperpower("FMJ bullets");
		
		Energizer energizer = new Energizer("Dirk", 40);
		energizer.setAlias("Energize");
		energizer.setSuperpower("Energize");
		
		Tank tank = new Tank("Pieter", 32);
		tank.setAlias("Tank");
		tank.setSuperpower("High defence");
		
		Shapeshifter shapeshifter = new Shapeshifter("Sarren", 25);
		shapeshifter.setAlias("Shapeshifter");
		shapeshifter.setSuperpower("Change appereance");
		
		list.addSuperHero(armored);
		list.addSuperHero(energizer);
		list.addSuperHero(tank);
		list.addSuperHero(shapeshifter);
		
		printHeader();
		fancyLines();
		for (Hero hero: list.heroes.values()) {
			print(hero);
			hero.useSuperPower();
			fancyLines();
		}

	}
	
	private static void print(Hero hero) {
		System.out.println(hero);
	}
	
	private static void printHeader() {
		System.out.println("Welcome to the mighties heroes!!!");
	}
	
	private static void fancyLines() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
