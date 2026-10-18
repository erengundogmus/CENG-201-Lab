/** Represents one song in a playlist. */
public class Track {
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
        this.isExplicit = isExplicit;
    }

    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getDurationSeconds() { return durationSeconds; }
    public boolean isExplicit() { return isExplicit; }

    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    @Override
    public String toString() {
        String summary = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";
        return isExplicit ? summary + " [EXPLICIT]" : summary;
    }
}
