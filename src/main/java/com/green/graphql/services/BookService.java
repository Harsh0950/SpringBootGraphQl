package com.green.graphql.services;

import com.green.graphql.entity.Book;
import com.green.graphql.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> getALlBooks(){
        return (List<Book>) bookRepo.findAll();
    }

    public Book getBook(int id){
        return bookRepo.findById(id);
    }

    public Book createBook(Book book) {
        return bookRepo.save(book);
    }
}

