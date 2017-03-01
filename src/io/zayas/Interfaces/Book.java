package io.zayas.Interfaces;

/**
 * Created by zayas on 2/21/17.
 */
public interface Book {
    String getAuthor();
    int  getYear();
    String getGenre();
    String getTitle();

    void updateAuthor(String author);
    void updateYear(int year);
    void updateGenre(String genre);
    void updateTitle(String title);
}
