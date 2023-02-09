package com.example.StudentLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BookController {

    @Autowired BookService bookService;
    @PostMapping("/add_book")
    public void addBook(@RequestBody() Book book){

        try {
            bookService.createBook(book);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/get_book")
    public Book getBook(@RequestParam("id") Integer id){
        try {
            Book book= bookService.getBookById(id);
            return book;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @PutMapping("/update_pages")
    public void updatePages(@RequestBody() UpdateBookPage updateBookPage){
     bookService.updateBookPage(updateBookPage);
    }
}
