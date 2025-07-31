package main.java.com.example.bookcatalog.repository;

import main.java.com.example.bookcatalog.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}