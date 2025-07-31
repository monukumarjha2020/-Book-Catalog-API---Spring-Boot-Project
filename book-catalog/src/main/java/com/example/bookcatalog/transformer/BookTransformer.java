package main.java.com.example.bookcatalog.transformer;

import main.java.com.example.bookcatalog.dto.BookDTO;
import main.java.com.example.bookcatalog.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookTransformer {

    public BookDTO toDTO(Book book) {
        BookDTO dto = new BookDTO();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        return dto;
    }

    public Book toEntity(BookDTO dto) {
        Book book = new Book();
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        return book;
    }
}