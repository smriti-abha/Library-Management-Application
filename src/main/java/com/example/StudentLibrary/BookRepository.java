package com.example.StudentLibrary;

import com.example.StudentLibrary.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
