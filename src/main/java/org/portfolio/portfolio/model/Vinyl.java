package org.portfolio.portfolio.model;

public class Vinyl {
    private int id;
    private String albumName;
    private String artistName;
    private int releaseYear;
    private String story;
    private String img;

    //CONSTRUCTORS
    public Vinyl(int id, String albumName, String artistName, int releaseYear, String story, String img) {
        this.id = id;
        this.albumName = albumName;
        this.artistName = artistName;
        this.releaseYear = releaseYear;
        this.story = story;
        this.img = img;
    }

    public Vinyl(String albumName, String artistName, int releaseYear, String story, String img) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.releaseYear = releaseYear;
        this.story = story;
        this.img = img;
    }

    public Vinyl(){}

    // GETTERS AND SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getStory() {
        return story;
    }

    public String getImg() {
        return img;
    }
}
