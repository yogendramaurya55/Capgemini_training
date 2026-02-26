package func_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameService {

	List<Game> games;

	public GameService() {

		games = new ArrayList<>(Arrays.asList(new Game("SnowBird", "Danny", 300), new Game("FreshFood", "Ram", 450),
				new Game("Batsman", "Kate", 400), new Game("Pokiman", "Steeve", 600),
				new Game("YammyTommy", "Narayan", 350)));
	}

	public List<Game> viewAll() {
		return games;
	}

	public String authorSearch(String author) {

		for (Game g : games) {

			if (g.authorName.equalsIgnoreCase(author.trim())) {
				return g.gameName;
			}
		}

		return "Not Found";

	}

}

