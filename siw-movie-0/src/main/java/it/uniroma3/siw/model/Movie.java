package it.uniroma3.siw.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //permette al framework di capire che per questa entità deve creare una tabella
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //permette al framework di capire che deve generare id sequenziale

    private Long id;
    private String title;
    public Integer year;
    public String urlImage;

    /* getter and setter methods */
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlImage() {
        return this.urlImage;
    }

    /* equals and hashCode */
    @Override
    public boolean equals (Object o) {
        final Movie that = (Movie) o;
        return ( this.getTitle().equals(that.getTitle()) && this.getYear() == that.getYear() );
    }

    @Override
    public int hashCode() {
        return this.getTitle().hashCode() + this.getYear().hashCode();
    }
}

