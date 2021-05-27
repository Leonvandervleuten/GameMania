import java.util.*;

public class GameCollection {
    private List<GamesInterface> games = new ArrayList<>();

    public List<GamesInterface> getAll() {
        return this.getAll(new GameReleaseYearComparator());
    }

    public List<GamesInterface> getAll(Comparator<GamesInterface> comparator) {
    GameDataStore gameDataStore = new GameDataStore();
    games = gameDataStore.getAll();

        games.sort(comparator);
        return Collections.unmodifiableList(games);
    }
}
