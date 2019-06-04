package be.my_portfolio.heroes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AllTheHeroes {
	public HashMap<Integer, Hero> heroes = new HashMap<Integer, Hero>();

	public AllTheHeroes() {
		super();
	}

	public void addSuperHero(Hero hero) {
		this.heroes.put(this.heroes.size(), hero);
	}

	public void removeSuperHero(Hero hero) {
		Iterator<Map.Entry<Integer, Hero>> iterator = this.heroes.entrySet().iterator();

		if (this.isHeroTypePresent(hero)) {
			while (iterator.hasNext()) {
				Map.Entry<Integer, Hero> entry = iterator.next();
				if (hero.equals(entry.getValue())) {
					iterator.remove();
				}
			}
		}
	}

	private boolean isHeroTypePresent(Hero hero) {
		Iterator<Map.Entry<Integer, Hero>> iterator = this.heroes.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, Hero> entry = iterator.next();
			if (hero.equals(entry.getValue())) {
				return true;
			}
		}

		return false;
	}
}
