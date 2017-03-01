package io.zayas.Objects;

import io.zayas.Interfaces.Book;

/**
 * Created by zayas on 2/21/17.
 */
public class LibraryBook implements Book {
    //LibraryBook object Declaration


    protected String author;
    protected String genre;
    protected int year;
    protected String title;

    public LibraryBook (String title, String author, String genre, int year){
        this.title = title.toLowerCase();
        this.author = author.toLowerCase();
        this.genre = genre.toLowerCase();
        this.year = year;
    }

        public String getTitle(){
            return title;
        }

    public String getAuthor(){
            return author;
    }

    public String getGenre(){
        return genre;
    }

    public int getYear(){
        return year;
    }

    public void updateTitle(String title){
        this.title = title.toLowerCase();
    }

    public void updateAuthor(String author){
        this.author = author.toLowerCase();
    }

    public void updateGenre(String genre){
        this.genre = genre.toLowerCase();
    }

    public void updateYear(int year){
        this.year = year;
    }
}

