package io.zayas.DataStructures;
import io.zayas.Interfaces.Book;
import io.zayas.Interfaces.Operations;
import io.zayas.Objects.LibraryBook;

/**
 * Created by zayas on 3/1/17.
 */
public class Arraybased implements Operations {

    // Much of this program is based on the StringLog found in Section 2.3
    private Book[] data;
    private int lastIndex = -1;
    private static final int INITIAL_CAPACITY = 10;

    public Arraybased() {
        data = new Book[INITIAL_CAPACITY];
    }

    public Arraybased(LibraryBook[] o) {
        data = o;

    }

    public Arraybased(int length) {
        data = new Book[length];
    }


    public void add(LibraryBook o) {
        lastIndex += 1;
        data[lastIndex] = o;

    }


    // Appends the specified element to the end of this list.
    public boolean add(int index, LibraryBook o) {
        if (index >= 0 && index <= data.length) {
            Book[] newArray = new Book[data.length + 1];
            for (int curentIndex = 0; curentIndex <= newArray.length - 1; curentIndex++) {
                if (curentIndex == index) {
                    newArray[curentIndex] = o;
                    continue;
                }
                newArray[curentIndex] = data[curentIndex];
            }
            data = newArray;
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Object[] o) {
        return false;
    }

    //Adds an array of objects to the end of the array. Returns
    //false if no items were added.
    @Override
    public boolean addAll(LibraryBook[] o) {
        if (o.length >= 1) {
            Book[] newArray = new Book[data.length + o.length];
            for (int index = 0; index <= data.length - 1; index++) {
                newArray[index] = data[index];
            }
            for (int index = 0; index <= o.length - 1; index++) {
                newArray[lastIndex] = o[index];
                lastIndex += 1;
            }
            data = newArray;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return lastIndex == -1;
    }


    //Removes the first instance of the object; returns false if
    // none are removed.
    @Override
    public boolean remove(Object o) {
        boolean removed = false;
        Book[] newArray = new Book[data.length];
        for (int index = 0; index <= data.length - 1; index++) {
            if (data[index] == o && !removed) {
                removed = true;
                lastIndex -= 1;
                continue;
            }
            newArray[index] = data[index];
        }
        data = newArray;
        return removed;
    }

    //Removes all the references to the object in the array. Returns
    //false if no references were removed.
    @Override
    public boolean removeAll(Object o) {
        boolean removed = false;
        Book[] newArray = new Book[data.length];
        int amountRemoved = 0;
        for (int i = 0; i <= data.length - 1; i++) {
            if (data[i] == o) {
                amountRemoved += 1;
                continue;
            }
            newArray[i] = data[i];
        }
        if (amountRemoved > 0) {
            Book[] updatedArray = new Book[newArray.length - amountRemoved];
            for (int i = 0; i <= updatedArray.length - 1; i++) {
                updatedArray[i] = newArray[i];
            }
            removed = true;
            lastIndex -= amountRemoved;
            data = updatedArray;
        }

        return removed;
    }

    //Returns the index of the first occurrence of the specified
    // element in this list, or –1 if this list does not contain
    // the element. This compares object references and not
    // object contents.
    @Override
    public int indexOf(Object o) {
        for (int index = 0; index <= data.length - 1; index++) {
            if (data[index] == o) {
                return index;
            }
        }
        return -1;
    }

    //Returns the last index of an object in the array.
    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = 0;
        for (int index = 0; index <= data.length - 1; index++) {
            if (data[index] == o) {
                lastIndex = index;
            }
        }
        return lastIndex;
    }

    //Returns the amount of items being held by the array.
    public int size() {
        return lastIndex + 1;
    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public void set(int index, LibraryBook o) {
        data[index] = o;
    }

    //Removes an object at index n and updates the lastIndex edited.
    @Override
    public void remove(int index) {
        int oldIndex = 0;
        int newIndex = 0;
        Book[] newArray = new Book[data.length - 1];
        do {
            if (oldIndex != index) {
                newArray[newIndex] = data[oldIndex];
                oldIndex += 1;
                newIndex += 1;
            } else {
                oldIndex += 1;
            }

        } while (newIndex <= newArray.length - 1);
        lastIndex -= 1;
        data = newArray;
    }

    //TODO - below
    @Override
    public Object[] subList(int fromIndex, int toIndex) {
        return new Object[0];
    }


    //Trims the array of excess values or set it to length 1 if there
    //are no values in it.
    @Override
    public void trimToSize() {
        if (data.length > lastIndex && lastIndex != -1) {
            Book[] newArray = new Book[lastIndex + 1];
            for (int index = 0; index <= newArray.length - 1; index++) {
                newArray[index] = data[index];
            }
            data = newArray;
        }
        if (lastIndex == -1) {
            data = new Book[1];
        }
    }

    //Increases the capacity of this list instance, if necessary,
    // to ensure that it can hold at least the number of elements
    // specified by the minimum capacity argument.
    @Override
    public void ensureCapacity(int minCapacity) {
        Book[] objHolder = new Book[minCapacity];
        if (data.length < minCapacity) {
            for (int index = 0; index <= data.length; index++) {
                objHolder[index] = data[index];
            }
            data = objHolder;
        }
    }

    //TODO - Not sure how
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    //Removes all of the elements from this list.
    @Override
    public void clear() {
        data = new Book[data.length];
        lastIndex = -1;
    }


    @Override
    public String toString() {
        return super.toString();
    }


    //Quadratic time Complexity (On^2)
    public void sortByYear() {
        if(size() <= 1){return;}
        for (int indexOfMin = 0; indexOfMin < size(); indexOfMin++) {
            for (int index = indexOfMin + 1; index < size(); index++) {
                if (data[index].getYear() <= data[indexOfMin].getYear()) {
                    Book value = data[indexOfMin];
                    data[indexOfMin] = data[index];
                    data[index] = value;
                }
            }
        }
    }

    //Quadratic time Complexity (On^2)
    public void sortByGenre(){
        if(size() <= 1){return;}
        for(int indexOfMin = 0; indexOfMin < size(); indexOfMin++){
            for(int index = indexOfMin + 1; index < size(); index ++) {
                if((data[indexOfMin].getGenre().compareTo(data[index].getGenre()) > 0)){
                    Book value = data[indexOfMin];
                    data[indexOfMin] = data[index];
                    data[index] = value;
                }
            }
        }
    }

    //Quadratic time Complexity (On^2)
    public void sortByAuthor() {
        if (size() <= 1) {return;}
        for (int indexOfMin = 0; indexOfMin < size(); indexOfMin++) {
            for (int index = indexOfMin + 1; index < size(); index++) {
                if ((data[indexOfMin].getAuthor().compareTo(data[index].getAuthor()) > 0)) {
                    Book value = data[indexOfMin];
                    data[indexOfMin] = data[index];
                    data[index] = value;
                }
            }
        }
    }

    /**
     * Quadratic Time Complexity
     */
    public void sortByTitle(){
        if(size() <= 1){return;}
        for(int indexOfMin = 0; indexOfMin < size(); indexOfMin++){
            for(int index = indexOfMin + 1; index < size(); index ++) {
                if((data[indexOfMin].getTitle().compareTo(data[index].getTitle()) > 0)) {
                    Book value = data[indexOfMin];
                    data[indexOfMin] = data[index];
                    data[index] = value;
                }
            }
        }
    }
}

