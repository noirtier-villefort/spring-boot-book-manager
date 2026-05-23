package org.noirtier.springbootbookmanager.servicies;

import org.noirtier.springbootbookmanager.entities.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> findAllBooks();
    Book findBookByAuthor(String author);
    Book findBookByName(String name);
}
