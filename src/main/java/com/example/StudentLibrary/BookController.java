package com.example.StudentLibrary;


import com.example.StudentLibrary.Models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/get_book_names_and_authors")
    public List<ResponseObj> getBookNamesAndAuthor() {
        List<ResponseObj> responseObjs= bookService.getBookNameAndAuthor();

        return responseObjs;
    }
}
