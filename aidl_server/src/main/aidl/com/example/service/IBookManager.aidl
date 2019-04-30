// IBookManager.aidl
package com.example.service;

// Declare any non-default types here with import statements
import com.example.service.Book;

interface IBookManager {
    void addBook(in Book book);
    List<Book> getBookList();
}
