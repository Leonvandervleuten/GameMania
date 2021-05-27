import java.util.*;

public class GameCollection {
    private List<GamesInterface> games = new GameDataStore().getAll();


    public List<GamesInterface> getAll() {
        return this.getAll(new GameReleaseYearComparator());
    }

    public List<GamesInterface> getAll(Comparator<GamesInterface> comparator) {
        games.sort(comparator);
        return Collections.unmodifiableList(games);
    }



    //test of data uit persistence layer in games list komt
//    public List<GamesInterface> getter(){
//        GameDataStore gameDataStore = new GameDataStore();
//        games = gameDataStore.getAll();
//        return games;
//    }
}
