/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.ArrayList;

/**
 *
 * @author Panzi
 */
public class BookDirectory {
    ArrayList<Book> bookList;

    public BookDirectory() {
        bookList = new ArrayList<Book>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    
    public Book findByName(String name){
        for(Book b: this.bookList) {
            if(b.getName().equals(name)) {
                return b;
            }
        }
        
        return null;
    }

    public Book createBook(String name, Author author, Genre genre){
       Book b = new Book();
       b.setName(name);
        b.setAuthor(author);
        b.setGenre(genre);
        
        this.bookList.add(b);
        return b;
    }
}
