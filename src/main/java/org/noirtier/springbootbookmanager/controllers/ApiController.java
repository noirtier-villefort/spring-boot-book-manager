package org.noirtier.springbootbookmanager.controllers;

import org.noirtier.springbootbookmanager.entities.Book;
import org.noirtier.springbootbookmanager.servicies.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String home(){
        return """
                <h2> Hello. </h2>
                <p> Use POST /addBook to create book. For example: </p>
                <code> 
                    POST localhost:8989/api/addBook
                    Content-Type: application/json
                    
                    {
                      "author": "Authoer Tester",
                      "name": "Book Name2",
                      "pages": 333
                    }
                </code>
                <p> GET /findAllBooks to get list of books </p>
                <p> GET /findBookByAuthor/{author} to get book by author </p>
                <p> GET /findBookByName/{name} to get book by name </p>
                """;
    }

    @GetMapping("/findAllBooks")
    public List<Book> findAllBooks(){
        return bookService.findAllBooks();
    }

    @PostMapping("/addBook")
    public String add(@RequestBody Book book){
        bookService.addBook(book);
        return "Book "+book.toString()+" added";
    }

    @GetMapping("/findBookByAuthor/{author}")
    public Book findBookByAuthor(@PathVariable String author){
        return bookService.findBookByAuthor(author);
    }

    @GetMapping("/findBookByName/{name}")
    public Book findBookByName(@PathVariable String name){
        return bookService.findBookByName(name);
    }

}
