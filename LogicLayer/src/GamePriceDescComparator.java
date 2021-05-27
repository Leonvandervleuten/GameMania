import java.util.Comparator;

public class GamePriceDescComparator implements Comparator<Game> {
    @Override
    public int compare(Game o1, Game o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
