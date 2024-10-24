public class BookProcessing {

public enum Source {
    AMAZON, FLIPCART;
}
public enum Publication {
    UNPUBLISHED, IN_REVIEW, PUBLISHED;
}
public enum BookGenre {
    FICTION, NON_FICTION, MYSTERY, FANTASY;
}
public enum Genre {
    FICTION, NON_FICTION, MYSTERY, FANTASY;
}
public enum Format {
    HARDCOVER, PAPERBACK, EBOOK, AUDIOBOOK;
}
public enum Level {
    NEWCOMER, MID_TIER, BESTSELLER, CLASSIC;
}
public enum Language{
    ENGLISH, FRENCH, SPANISH, GERMAN;
}
public enum ReadingLevel {
    BEGINNER,  ADVANCED, EXPERT;
}
public enum BookCondition {
    NEW, USED,DAMAGED;
}
public enum Binding {
    HARDCOVER, PAPERBACK, SPIRAL;
}



    public static void main(String[] args) {
        Genre genre = Genre.FICTION;
        Format format = Format.HARDCOVER;
        Language language = Language.ENGLISH;
        Binding binding = Binding.PAPERBACK;
        Level fameLevel = Level.BESTSELLER;
        Publication status = Publication.PUBLISHED;
        Audience audience = Audience.ADULT;
        BookCondition condition = BookCondition.NEW;
        ReadingLevel reading=ReadingLevel.BEGINNER;
        Source source=Source.AMAZON;

        System.out.println("Book genre: " + genre);
        System.out.println("Book format: " + format);
        System.out.println("Language: " + language);
        System.out.println("Binding type: " + binding);
        System.out.println("Author fame level: " + fameLevel);
        System.out.println("Publication status: " + status);
        System.out.println("Target audience: " + audience);
        System.out.println("Book condition: " + condition);
         System.out.println("ReadingLevel : " + reading);
         System.out.println("Source : " + source);

    }
}