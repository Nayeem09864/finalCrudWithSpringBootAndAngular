package com.example.backend.service;

import com.example.backend.entity.Book;
import com.example.backend.entity.BookType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();

    public Book getBookById(@PathVariable Long id);
    public Book getBookByTitle(@PathVariable String title);


    public Book addBook(@RequestBody Book book);

    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook);


    public void deleteBook(@PathVariable Long id);

    public Book addBookByCheckingTitle(@RequestBody Book book);

    public List<Book> getBookByType(@PathVariable BookType type);
}
