package main.java.com.example.bookcatalog.service;

import main.java.com.example.bookcatalog.dto.BookDTO;
import main.java.com.example.bookcatalog.entity.Book;
import main.java.com.example.bookcatalog.repository.BookRepository;
import main.java.com.example.bookcatalog.transformer.BookTransformer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookTransformer transformer;

    public BookService(BookRepository bookRepository, BookTransformer transformer) {
        this.bookRepository = bookRepository;
        this.transformer = transformer;
    }

    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(transformer::toDTO)
                .collect(Collectors.toList());
    }

    public BookDTO createBook(BookDTO bookDTO) {
        Book book = transformer.toEntity(bookDTO);
        return transformer.toDTO(bookRepository.save(book));
    }

    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        Book book = bookRepository.findById(id).orElseThrow();
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        return transformer.toDTO(bookRepository.save(book));
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}