package dev.lliriq.bookmanager.service;

import dev.lliriq.bookmanager.model.Book;
import dev.lliriq.bookmanager.repository.BookRepository;
import org.springframework.stereotype.Service;

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
}
