package dev.lliriq.bookmanager.service;

import dev.lliriq.bookmanager.model.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    private final Map<Long, Book> books = new HashMap<>();
    private long nextId = 1;

    public List<Book> getAll() {
        return new ArrayList<>(books.values());
    }

    public Book add(Book book) {
        book.setId(nextId++);
        books.put(book.getId(), book);
        return book;
    }

    public Book getById(Long id) {
        return books.get(id);
    }

    public void delete(Long id) {
        books.remove(id);
    }
}
