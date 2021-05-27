public class Game implements GamesInterface{
    private final String name;
    private final double price;
    private final int releaseYear;
    private final String publisher;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public int getReleaseYear() {
        return releaseYear;
    }
    @Override
    public String getPublisher() {
        return publisher;
    }

    public Game(String name, double price, int releaseYear, String publisher) {
        this.name = name;
        this.price = price;
        this.releaseYear = releaseYear;
        this.publisher = publisher;
    }
}
