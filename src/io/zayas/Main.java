package io.zayas;

import io.zayas.DataStructures.Arraybased;
import io.zayas.Objects.LibraryBook;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Arraybased test = new Arraybased(10);


        LibraryBook obj = new LibraryBook("Harry Potter", "J.K Roling", "Fantasy", 2001);

        test.add(obj);

        int year = 1;

       // LibraryBook aws = (LibraryBook)test.get(0);

        year = 2;

        String title =  ((LibraryBook)test.get(0)).getTitle(); //aws.getTitle();

        year = 3;

        test.add(new LibraryBook("Eragon", "P.K", "Fantasy", 2000));

        test.sortByYear();

        year = 4;
    }
}
