package io.motolola.randomhouse.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.Nullable;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class Book
{
    @JsonProperty("author")
    private String author;

    @JsonProperty("authorbio")
    private String authorbio;

    @JsonProperty("authorweb")
    private String authorweb;

    @JsonProperty("isbn")
    private String isbn;

    @JsonProperty("pages")
    private String pages;

    @JsonProperty("workid")
    @Nullable
    private int workid;

    @JsonProperty("titleweb")
    private String titleweb;

    @JsonProperty("titleauthisbn")
    private String titleauthisbn;

    @JsonProperty("acmartflap")
    private String acmartflap;

    @JsonProperty("flapcopy")
    private String flapcopy;

    public Book(String author, String authorbio, String authorweb, String isbn)
    {
        this.author = author;
        this.authorbio = authorbio;
        this.authorweb = authorweb;
        this.isbn = isbn;
    }

    public Book()
    {
        //empty default constructor.
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorbio() {
        return authorbio;
    }

    public void setAuthorbio(String authorbio) {
        this.authorbio = authorbio;
    }

    public String getAuthorweb() {
        return authorweb;
    }

    public void setAuthorweb(String authorweb) {
        this.authorweb = authorweb;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public int getWorkid() {
        return workid;
    }

    public void setWorkid(int workid) {
        this.workid = workid;
    }

    public String getTitleweb() {
        return titleweb;
    }

    public void setTitleweb(String titleweb) {
        this.titleweb = titleweb;
    }

    public String getTitleauthisbn() {
        return titleauthisbn;
    }

    public void setTitleauthisbn(String titleauthisbn) {
        this.titleauthisbn = titleauthisbn;
    }

    public String getAcmartflap() {
        return acmartflap;
    }

    public void setAcmartflap(String acmartflap) {
        this.acmartflap = acmartflap;
    }

    public String getFlapcopy() {
        return flapcopy;
    }

    public void setFlapcopy(String flapcopy) {
        this.flapcopy = flapcopy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", authorbio='" + authorbio + '\'' +
                ", authorweb='" + authorweb + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pages='" + pages + '\'' +
                ", workid=" + workid +
                ", titleweb='" + titleweb + '\'' +
                ", titleauthisbn='" + titleauthisbn + '\'' +
                ", acmartflap='" + acmartflap + '\'' +
                ", flapcopy='" + flapcopy + '\'' +
                '}';
    }
}
