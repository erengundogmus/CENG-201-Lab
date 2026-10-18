import game.inventory.Inventory;
import game.inventory.Item;

/** Runs the game shop inventory demonstration. */
public class GameShop {
    public static void main(String[] args) {
        Inventory shop = new Inventory();

        Item galaxyRacer = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item shadowRealm = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item pixelLegends = new Item("Pixel Legends", "Strategy", 3, "PL-0091");
        shop.addItem(galaxyRacer);
        shop.addItem(shadowRealm);
        shop.addItem(pixelLegends);

        shop.displayAll();
        System.out.println();

        galaxyRacer.sell(4);
        shadowRealm.sell(6);
        System.out.println();

        shop.displayAll();
        System.out.println();

        shop.auditSerialCodes();

        // This does not compile here: getSerialCode() is package-private,
        // and GameShop is outside the game.inventory package.
        // System.out.println(galaxyRacer.getSerialCode());
    }
}
