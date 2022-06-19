/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JESSE
 */
public class Books {
    
    private String title;
    private int pages;
    private int published;
    
    public Books(String title, int pages, int published) {
        this.title = title;
        this.pages = pages;
        this.published = published;
    }
 
    public String getTitle() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int published() {
        return this.published;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.published;
    }
    
}
