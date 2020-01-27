package io.motolola.randomhouse.service;

import io.motolola.randomhouse.pojo.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
@RunWith(SpringRunner.class)
public class BookServiceTest
{
    /**
     * RestTemplate Mock.
     */
    @Mock
    private RestTemplate restTemplate;

    /**
     * Injecting the Mocked Objects into the class under test.
     */
    @InjectMocks
    private BookService bookService;

    @Test
    public void testGetBook()
    {
        final Book book = new Book("AuthorName", "AuthorBio", "AuthorWeb", "ISBN");
        Mockito
                .when(restTemplate.getForEntity(anyString(), any()))
                .thenReturn(new ResponseEntity(book, HttpStatus.OK));

        final Book bookTest = bookService.get("dfgh").getBody();
        Assert.assertEquals(bookTest.getAuthor(), "AuthorName");
    }

}