/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppSystem;

import Book.*;
import Customer.CustomerDirectory;
import Librarian.Librarian;

/**
 *
 * @author Panzi
 */
public class AppSystem {
    private UserAccountDirectory userAccountDirectory;
    private CustomerDirectory customerDirectory;
    private BookDirectory allBooks;
    private AuthorDirectory authorDirectory;
    private GenreDirectory genreDirectory;
    private Librarian librarian;

    public AppSystem() {
        this.userAccountDirectory = new UserAccountDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.allBooks = new BookDirectory();
        this.authorDirectory = new AuthorDirectory();
        this.genreDirectory = new GenreDirectory();
        this.librarian = new Librarian();

        UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", "sysadmin");
    }
 
    public static AppSystem getAppSystemInstance() {
        
        return new AppSystem();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory useraccountDirectory) {
        this.userAccountDirectory = useraccountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public BookDirectory getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(BookDirectory allBooks) {
        this.allBooks = allBooks;
    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public void setAuthorDirectory(AuthorDirectory authorDirectory) {
        this.authorDirectory = authorDirectory;
    }

    public GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

    public void setGenreDirectory(GenreDirectory genreDirectory) {
        this.genreDirectory = genreDirectory;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }


}
