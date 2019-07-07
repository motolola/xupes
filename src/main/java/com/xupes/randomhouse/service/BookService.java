package com.xupes.randomhouse.service;

import com.xupes.randomhouse.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
@Service
public class BookService
{
    private RestTemplate restTemplate;

    /**
     * Constructor Autowired RestTemplate.
     * @param restTemplate restTemplate.
     */
    @Autowired
    public BookService(@NonNull final RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    /**
     * This makes calls to the external server to get book details.
     * @param isbn isbn
     * @return ResponseEntity<Book>
     */
    public ResponseEntity<Book> get(@NonNull final String isbn)
    {
        final String randomHouseURL
                = "https://reststop.randomhouse.com/resources/titles/";
        String resourceURL = randomHouseURL + isbn;

        try
        {
            return restTemplate.getForEntity(resourceURL, Book.class);

        } catch (Exception e)
        {
            //TODO: Use a logger.
            System.out.println(e.getMessage());
        }
        return null;
    }
}
