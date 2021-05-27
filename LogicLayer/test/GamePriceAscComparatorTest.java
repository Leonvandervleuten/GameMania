import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GamePriceAscComparatorTest {

    @Test
    void CompareFirstArgumentIsGreaterThanSecondReturnsOne() {
        //Arrange
        int expected = 1;
        GamePriceAscComparator comparator = new GamePriceAscComparator();
        Game g1 = new Game("G1", 19.99, 2020, "P1");
        Game g2 = new Game("G2", 19.98, 2020, "P1");

        //Act
        int result = comparator.compare(g1, g2);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void CompareFirstArgumentIsLessThanSecondReturnsMinusOne() {
        //Arrange
        int expected = -1;
        GamePriceAscComparator comparator = new GamePriceAscComparator();
        Game g1 = new Game("G1", 17.98, 2020, "P1");
        Game g2 = new Game("G2", 17.99, 2020, "P1");

        //Act
        int result = comparator.compare(g1, g2);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void CompareFirstArgumentIsEqualToSecondReturnsZero() {
        //Arrange
        int expected = 0;
        GamePriceAscComparator comparator = new GamePriceAscComparator();
        Game g1 = new Game("G1", 17.98, 2020, "P1");
        Game g2 = new Game("G2", 17.98, 2020, "P1");

        //Act
        int result = comparator.compare(g1, g2);

        //Assert
        assertEquals(expected, result);
    }
}