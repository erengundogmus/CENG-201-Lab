 /** Your Name: Eren Gündoğmuş
 * Your Student ID: 230446010
 * Your Date: 18.10.2026     **/


/** Demonstrates Track constructors and methods. */
public class PlaylistDemo {
    public static void main(String[] args) {
        System.out.println("=== Playlist Track Demo ===\n");

        Track defaultTrack = new Track();
        System.out.println("Default Track:");
        System.out.println(defaultTrack);

        Track titleOnly = new Track("Neon Lights");
        System.out.println("\nTitle-only track:");
        System.out.println(titleOnly);

        Track titleArtist = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("\nTitle + Artist Track:");
        System.out.println(titleArtist);

        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("\nFull Track (non-explicit):");
        System.out.println(fullTrack);

        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("\nGetter Test:");
        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  " + getterTrack.isExplicit());
        System.out.println("Duration seconds: " + getterTrack.getDurationSeconds());

        System.out.println("\nInvalid Duration Test:");
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -10, false);
        System.out.println(invalidTrack);
    }
}
