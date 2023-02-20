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
public class GenreDirectory {
    ArrayList<Genre> genreList;

    public GenreDirectory() {
        genreList = new ArrayList<Genre>();
    }

    public ArrayList<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(ArrayList<Genre> genreList) {
        this.genreList = genreList;
    }

    
    
    public Genre findByDesc(String desc){
        for(Genre g: this.genreList) {
            if(g.getDesc().equals(desc)) {
                return g;
            }
        }
        
        return null;
    }

    public Genre createGenre(String desc){
       Genre g = new Genre();
       g.setDesc(desc);
        
        this.genreList.add(g);
        return g;
    }
}
