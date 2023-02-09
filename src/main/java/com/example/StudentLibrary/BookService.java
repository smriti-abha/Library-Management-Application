package com.example.StudentLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public void createBook(Book book) throws Exception {

        if(bookRepository.findById(book.getId()).get()!=null){

            throw new Exception("Book is already Present");

        }
        bookRepository.save(book);
    }
    public Book getBookById(Integer id) throws Exception{
        Book book=bookRepository.findById(id).get();
        System.out.println(book.getName());
        return book;
    }
    public void updateBookPage(UpdateBookPage updateBookPage){
       int id= updateBookPage.getId();
       Book booktoBeupdated= bookRepository.findById(id).get();
       booktoBeupdated.setPages(updateBookPage.getPages());
        bookRepository.save(booktoBeupdated);
    }
}
