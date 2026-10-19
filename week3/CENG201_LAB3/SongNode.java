/**
 * SongNode.java
 * Represents a song in a playlist.
 *
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        19.10.2026
 */
public class SongNode {
    String title;
    SongNode prev;
    SongNode next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}
