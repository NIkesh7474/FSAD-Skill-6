package com.fsad.mvc;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class LibraryController {

    // In-memory book list for Task 9 and 10
    private List<Book> bookList = new ArrayList<>();

    // Task 2 -- GET /welcome
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Online Library System!";
    }

    // Task 3 -- GET /count
    @GetMapping("/count")
    public int totalBooks() {
        return 150;
    }

    // Task 4 -- GET /price
    @GetMapping("/price")
    public double bookPrice() {
        return 499.99;
    }

    // Task 5 -- GET /books
    @GetMapping("/books")
    public List<String> getAllBooks() {
        return Arrays.asList(
            "Clean Code",
            "Effective Java",
            "Spring in Action",
            "Design Patterns"
        );
    }

    // Task 6 -- GET /books/{id}
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Book ID: " + id + " | Title: Spring Boot in Practice";
    }

    // Task 7 -- GET /search?title=xxx
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Search result for: " + title;
    }

    // Task 8 -- GET /author/{name}
    @GetMapping("/author/{name}")
    public String getByAuthor(@PathVariable String name) {
        return "Books by author: " + name;
    }

    // Task 9 -- POST /addbook
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book added: " + book.getTitle();
    }

    // Task 10 -- GET /viewbooks
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }
}
