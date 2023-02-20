/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalRequest;

import Book.Book;
import Customer.Customer;
import Librarian.Librarian;
import java.util.ArrayList;

/**
 *
 * @author Panzi
 */
public class RentalRequestDir {
    ArrayList<RentalRequest> requestList;
    
    public RentalRequestDir() {
        this.requestList = new ArrayList<RentalRequest>();
    }

    public ArrayList<RentalRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<RentalRequest> requestList) {
        this.requestList = requestList;
    }


    
    // create a new rental request
    public RentalRequest createRentalRequest(Book book, Customer customer, Librarian librarian) {
         RentalRequest r = new RentalRequest(book, customer, librarian);
        this.requestList.add(r);
        return r;
    }
    
    public RentalRequest requestRequest(Customer customer) {
        RentalRequest r = new RentalRequest();
        r.setCustomer(customer);
        
        this.requestList.add(r);
        return r;
    }
    
    public RentalRequest assignRequest(RentalRequest r, Librarian librarian) {
        r.setLibrarian(librarian);
        return r;
    }
}
