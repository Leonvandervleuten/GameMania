//https://stackoverflow.com/questions/1051182/what-is-a-data-transfer-object-dto#:~:text=A%20Data%20Transfer%20Object%20is,itself%20and%20the%20UI%20layer.
public class GameDTO implements GamesInterface {
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

    public GameDTO(String name, double price, int releaseYear, String publisher) {
        this.name = name;
        this.price = price;
        this.releaseYear = releaseYear;
        this.publisher = publisher;
    }
}
