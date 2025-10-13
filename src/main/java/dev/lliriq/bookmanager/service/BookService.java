package dev.lliriq.bookmanager.service;

import dev.lliriq.bookmanager.model.Book;
import dev.lliriq.bookmanager.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAll() {
        return repository.findAll();
    }

    public Book add(Book book) {
        return repository.save(book);
    }

    public Book getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Book update(Long id, Book updatedBook) {
        return repository.findById(id)
                .map(book -> {
                    book.setTitle(updatedBook.getTitle());
                    book.setAuthor(updatedBook.getAuthor());
                    book.setYear(updatedBook.getYear());
                    book.setPages(updatedBook.getPages());
                    return repository.save(book);
                })
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public List<Book> findByTitle(String title) {
        return repository.findByTitle(title);
    }

    public List<Book> findByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    public List<Book> findByYear(Short year) {
        return repository.findByYear(year);
    }
}
