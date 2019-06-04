package be.my_portfolio.heroes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AllTheHeroes {
	// HashMap to store all the heroes
	public HashMap<Integer, Hero> heroes = new HashMap<Integer, Hero>();

	/**
	 * Constructor
	 */
	public AllTheHeroes() {
		super();
	}

	/**
	 * Add a super hero to the list.
	 * 
	 * @param hero
	 */
	public void addSuperHero(Hero hero) {
		this.heroes.put(this.heroes.size(), hero);
	}

	/**
	 * Remove a super hero from the list.
	 * 
	 * @param hero
	 */
	public void removeSuperHero(Hero hero) {
		// Get the entryset iterator
		Iterator<Map.Entry<Integer, Hero>> iterator = this.heroes.entrySet().iterator();

		// check if the hero is in the list
		if (this.isHeroTypePresent(hero)) {
			// As long there is another entry in the iterator
			while (iterator.hasNext()) {
				// Get the entry
				Map.Entry<Integer, Hero> entry = iterator.next();
				/*
				 * If the hero is the same as the current entry
				 * remove the entry from the list
				 */
				if (hero.equals(entry.getValue())) {
					iterator.remove();
				}
			}
		}
	}

	/**
	 * Check if the given hero is in the list.
	 * 
	 * @param hero
	 * @return
	 */
	private boolean isHeroTypePresent(Hero hero) {
		// Get the entrysets iterator
		Iterator<Map.Entry<Integer, Hero>> iterator = this.heroes.entrySet().iterator();

		while (iterator.hasNext()) {
			// As long there is another entry in the iterator
			Map.Entry<Integer, Hero> entry = iterator.next();
			/*
			 * If the given hero is the same as the current entry,
			 * we will return true because it is in the list
			 */
			if (hero.equals(entry.getValue())) {
				return true;
			}
		}

		/*
		 * If the iterator didn't had the same value as the given
		 * hero, we'll return false because the given hero is not in the list.
		 */
		return false;
	}

	public void addSuperHeroes(Hero... heroes) {
		for (Hero hero : heroes) {
			this.addSuperHero(hero);
		}
	}
}
