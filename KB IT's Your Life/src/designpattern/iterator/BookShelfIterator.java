//package designpattern.iterator;
//
//import java.io.*;
//import java.util.*;
//
//public class BookShelfIterator implements Iterator<Book> {
//    private BookShelfIterator bookShelf;
//    private int index;
//
//    public BookShelfIterator(BookShelf bookShelf) {
//        this.bookShelf = bookShelf;
//        this.index = 0;
//    }
//
//    @Override
//    public boolean hasNext() {
//        if (index < bookShelf.getLenth()) {
//            return true;
//        } else  {
//            return false;
//        }
//    }
//
//    @Override
//    public Book next() {
//        if (!hasNext()) {
//            throw new NoSuchElementException();
//        }
//
//        Book book = bookShelf.getBookAt(index);
//        index++;
//        return book;
//    }
//}
