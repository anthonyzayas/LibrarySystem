package io.zayas.Interfaces;

import io.zayas.Objects.LibraryBook;

/**
 * Created by zayas on 3/1/17.
 */
public interface Operations {
    void add(LibraryBook o);
    void clear();
    void ensureCapacity(int minCapacity);
    int indexOf(Object o);
    boolean isEmpty();
    void remove(int index);
    Object get(int index);
    void set(int index, LibraryBook o);
    int size();
    String toString();

    boolean add(int index, LibraryBook o);
    boolean addAll(LibraryBook[] o);
    boolean addAll(int index, Object[] o);
    int lastIndexOf(Object o);
    boolean remove(Object o);
    boolean removeAll(Object o);
    Object[] subList(int fromIndex, int toIndex);
    Object[] toArray();
    void trimToSize();
}
