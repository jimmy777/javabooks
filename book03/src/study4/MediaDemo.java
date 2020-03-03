package study4;

public class MediaDemo {
    String title;
    Media media;

    public MediaDemo(String title, Media media) {
        this.title = title;
        this.media = media;
    }

    @Override
    public String toString() {
        switch (media){
            case BOOK:
                return title + " is a book.";
            case MUSIC_CD:
                return title + " is a CD.";
            case MUSIC_VINYL:
                return title + " is relic of the age of vinyl.";
            case MOVIE_VHS:
                return title + " is on old video tape.";
            case MOVIE_DVD:
                return title + " is on DVD.";
            default:
                return title + ": Unknown media." + media;
        }
    }
}
