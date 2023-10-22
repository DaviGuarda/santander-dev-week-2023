package me.dio.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tbl_gamenews")
public class GameNews extends BaseItem{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
