//package designpattern.iterator;
//
//public class BookShelf implements Iterator<Book> {
//    private Book[] books;
//    private int last = 0;
//
//    public BookShelf(int maxsize) {
//        this.books = new Book[maxsize];
//    }
//
//    public Book getBookAt(int index)
//    {
//        return books[index];
//    }
//
//    public void appendBook(Book book)
//    {
//        books[last++] = book;
//    }
//
//    public int getLength()
//    {
//        return last;
//    }
//
//    @Override
//    public java.util.Iterator<Book> iterator() {
//        return new BookShelfIterator(this);
//    }
//}
