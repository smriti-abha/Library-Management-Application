package com.example.StudentLibrary;


import com.example.StudentLibrary.Models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public List<ResponseObj> getBookNameAndAuthor(){
        List<Book> bookList=bookRepository.findAll();
        List<ResponseObj> ansList= new ArrayList<ResponseObj>();

        for(Book book:bookList){

            ResponseObj responseObj= new ResponseObj();
            responseObj.author=book.getAuthor();
            responseObj.name=book.getName();
            ansList.add(responseObj);
        }
        return ansList;
    }
}
