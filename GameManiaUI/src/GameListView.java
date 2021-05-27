import java.util.List;

public class GameListView {
    private final GameCollection gameCollection;

    public GameListView() {
        gameCollection = new GameCollection();
    }

    public void display() {
        List<GamesInterface> games = gameCollection.getAll();
        for (GamesInterface game : games) {
            System.out.println("Game " + game.getName() + " released in " + game.getReleaseYear() +" by " + game.getPublisher() + " costs: " + game.getPrice());
        }
    }
}
