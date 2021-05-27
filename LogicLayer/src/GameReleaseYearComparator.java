import java.util.Comparator;

public class GameReleaseYearComparator implements Comparator<Game> {
    @Override
    public int compare(Game o1, Game o2) {

        return Integer.compare(o2.getReleaseYear(), o1.getReleaseYear());
    }
}
