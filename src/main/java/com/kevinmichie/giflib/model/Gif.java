package com.kevinmichie.giflib.model;

import java.time.LocalDate;

/**
 * Created by kevinmichie on 4/2/16.
 */
public class Gif {
    private String name;
    private LocalDate dateUploaded;
    private String username;
    private boolean favortie;

    public Gif(String name, LocalDate dateUploaded, String username, boolean favortie) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favortie = favortie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavortie() {
        return favortie;
    }

    public void setFavortie(boolean favortie) {
        this.favortie = favortie;
    }
}
