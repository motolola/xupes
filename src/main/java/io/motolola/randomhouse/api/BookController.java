package io.motolola.randomhouse.api;

import io.motolola.randomhouse.pojo.Book;
import io.motolola.randomhouse.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 * A controller to create an endpoint for
 * the system.
 */
@RestController
@RequestMapping("/api")
public class BookController
{

    /**
     * BookService.
     */
    private BookService bookService;

    /**
     * Constructor Autowire of BookService.
     * @param bookService bookService.
     */
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * Endpoint to display book details.
     * @param isbn isbn.
     * @return Book book.
     */
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


