package game.inventory;

/** A game title available in the shop. */
public class Item {
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = Math.max(stockCount, 0);
        this.serialCode = serialCode;
    }

    public String getName() { return name; }
    public String getGenre() { return genre; }
    public int getStockCount() { return stockCount; }

    String getSerialCode() { return serialCode; }

    private boolean isAvailable(int quantity) {
        return quantity >= 0 && stockCount >= quantity;
    }

    public void sell(int quantity) {
        if (quantity <= 0) {
            System.out.println("WARNING: Quantity must be greater than zero.");
        } else if (isAvailable(quantity)) {
            stockCount -= quantity;
            System.out.println("Sold " + quantity + " copy/copies of " + name
                    + ". Remaining stock: " + stockCount);
        } else {
            System.out.println("WARNING: Not enough stock for " + name
                    + ". Requested: " + quantity + ", Available: " + stockCount);
        }
    }
}
