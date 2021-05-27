import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GameDataStore {
    //Quite a funny database this is ;-)
    //Source: https://en.wikipedia.org/wiki/List_of_years_in_games
    private final List<GameDTO> games = new ArrayList<>() {
        {
            add(new GameDTO("Cyberpunk 2077", 47.99, 2020, "CD Projekt"));
            add(new GameDTO("Sekiro: Shadows Die Twice", 29.99, 2019, "Activision"));
            add(new GameDTO("Super Smash Bros Ultimate", 27.50, 2018, "Nintendo"));
            add(new GameDTO("South Park: The Fractured But Whole", 19.99, 2017, "Ubisoft"));
            add(new GameDTO("Pokémon Go", 9.99, 2016, "Nintendo"));
            add(new GameDTO("Overwatch", 12, 2016, "Blizzard"));
            add(new GameDTO("Rayman Raving Rabbids", 25, 2006, "Ubisoft"));
        }
    };

    public List<GamesInterface> getAll() {
        return Collections.unmodifiableList(this.games);
    }
}
