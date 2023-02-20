/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalRequest;

import Book.Book;
import Customer.Customer;
import Librarian.Librarian;

/**
 *
 * @author Panzi
 */
public class RentalRequest {
    Book book;
    Customer customer;
    Librarian librarian;
    private static int count = 0;
    String requestId;
    String status;
    String duration;
    
    public RentalRequest() {
        this.book = new Book();
        this.customer = new Customer();
        this.librarian = new Librarian();
        this.status = "Created";
        this.count++;
        
        this.requestId = "REQUESTNO"+this.count;
    }
    
    public RentalRequest(Book book, Customer customer, Librarian librarian) {
        this.book = book;
        this.customer = customer;
        this.librarian = librarian;
        this.status = "Created";
        this.count++;
        
        this.requestId = "REQUESTNO"+this.count;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }


    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    @Override
    public String toString() {
       return this.requestId;
    }
}
