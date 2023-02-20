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
public class AuthorDirectory {
    ArrayList<Author> authorList;

    public AuthorDirectory() {
        authorList = new ArrayList<Author>();
    }

    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(ArrayList<Author> authorList) {
        this.authorList = authorList;
    }
    
    public Author findByName(String name){
        for(Author a: this.authorList) {
            if(a.getName().equals(name)) {
                return a;
            }
        }
        
        return null;
    }

    public Author createAuthor(String name){
       Author a = new Author();
       a.setName(name);
        
        this.authorList.add(a);
        return a;
    }
}
