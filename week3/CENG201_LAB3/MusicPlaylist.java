/**
 * MusicPlaylist.java
 * Represents a doubly linked list for a music playlist.
 *
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        19.10.2026
 */
public class MusicPlaylist {
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    public MusicPlaylist() {
        head = null;
        tail = null;
        current = null;
    }

    public void addSong(String title) {
        SongNode newNode = new SongNode(title);

        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void removeSong(String title) {
        SongNode nodeToRemove = head;
        while (nodeToRemove != null && !nodeToRemove.title.equals(title)) {
            nodeToRemove = nodeToRemove.next;
        }

        if (nodeToRemove == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }

        if (nodeToRemove.prev != null) {
            nodeToRemove.prev.next = nodeToRemove.next;
        } else {
            head = nodeToRemove.next;
        }

        if (nodeToRemove.next != null) {
            nodeToRemove.next.prev = nodeToRemove.prev;
        } else {
            tail = nodeToRemove.prev;
        }

        if (nodeToRemove == current) {
            current = (nodeToRemove.next != null) ? nodeToRemove.next : nodeToRemove.prev;
        }

        nodeToRemove.prev = null;
        nodeToRemove.next = null;
        System.out.println("Removed: " + title);
    }

    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }

    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }

    public void displayCurrentSong() {
        if (current == null) {
            System.out.println("No song is currently playing.");
        } else {
            System.out.println("Current Song: " + current.title);
        }
    }

    public void displayPlaylist() {
        SongNode node = head;
        while (node != null) {
            System.out.print(node.title + " <-> ");
            node = node.next;
        }
        System.out.println("END");
    }
}
