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
    @Autowired
    private BookService bookService;

    @GetMapping("/book/{titles}")
    public Book getBook(@PathVariable String titles)
    {
        ResponseEntity<Book> response = bookService.get(titles);

        if (response != null)
        {
            return response.getBody();
        }
        return new Book();
    }
}


