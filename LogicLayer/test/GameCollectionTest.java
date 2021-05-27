//import org.junit.Test;
//
//import java.util.List;
//
//import static org.junit.Assert.assertTrue;
//
//public class GameCollectionTest {
//    @Test
//    public void whenGetAllIsCalledWithoutComparatorResultIsSortedByReleaseYearOfGame() {
//        //Arrange
//        GameCollection collection = new GameCollection();
//        List<Game> games;
//
//        //Act
//        games = collection.getAll();
//
//        //Assert
//        int year = games.get(0).getReleaseYear();
//        for (Game g : games) {
//            assertTrue(g.getReleaseYear() <= year);
//            year = g.getReleaseYear();
//        }
//    }
//
//    @Test
//    public void whenGetAllIsCalledWithPriceAscComparatorResultIsSortedByPriceOfGameAscending() {
//        //Arrange
//        GameCollection collection = new GameCollection();
//        List<Game> games;
//
//        //Act
//        games = collection.getAll(new GamePriceAscComparator());
//
//        //Assert
//        double price = games.get(0).getPrice();
//        for (Game g : games) {
//            assertTrue(g.getPrice() >= price);
//            price = g.getPrice();
//        }
//    }
//
//
//}
