package dev.lliriq.bookmanager.controller;

import dev.lliriq.bookmanager.model.Book;
import dev.lliriq.bookmanager.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")

public class BookController {

    public final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.getById(id);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.add(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.delete(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        return bookService.update(id, updatedBook);
    }

    @GetMapping("/{author}")
    public List<Book> getBooksByAuthor(@PathVariable String author) {
        return bookService.findByAuthor(author);
    }

    @GetMapping("/{year}")
    public List<Book> getBooksByYear(@PathVariable Short year) {
        return bookService.findByYear(year);
    }

    @GetMapping("/{title}")
    public List<Book> getBooksByTitle(@PathVariable String title) {
        return bookService.findByTitle(title);
    }
}
