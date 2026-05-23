package org.noirtier.springbootbookmanager.servicies;

import org.noirtier.springbootbookmanager.entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService{
    private List<Book> booksList = new ArrayList<>();

    @Override
    public List<Book> findAllBooks(){
        return booksList;
    }
    @Override
    public void addBook(Book book) {
        booksList.add(book);
    }

    @Override
    public Book findBookByAuthor(String author) {
        return booksList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .findAny()
                .orElse(null);
    }

    @Override
    public Book findBookByName(String name) {
        return booksList.stream()
                .filter(book -> book.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
