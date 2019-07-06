package com.xupes.randomhouse.api;

import com.xupes.randomhouse.pojo.Book;
import com.xupes.randomhouse.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
@RestController
@RequestMapping("/api")
public class BookController
{

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book/{isbn}")
    public Book getBook(@PathVariable String isbn)
    {
        ResponseEntity<Book> response = bookService.get(isbn);

        if (response != null)
        {
            return response.getBody();
        }
        return new Book();
    }
}


