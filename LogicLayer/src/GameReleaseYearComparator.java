import java.util.Comparator;

public class GameReleaseYearComparator implements Comparator<GamesInterface> {
    @Override
    public int compare(GamesInterface o1, GamesInterface o2) {

        return Integer.compare(o2.getReleaseYear(), o1.getReleaseYear());

    }
}
