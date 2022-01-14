package com.example.applicazione;

import java.util.ArrayList;

public class brano {
    private String titolo;
    private int durata;
    private String autore;
    private Date datacreazione;

    public Brano (String titolo){
        this.titolo=titolo;
    }

    public brano() {
    }

    public String getTitolo(){
        return titolo;
    }
    public void setTitolo(String titolo){
        this.titolo=titolo;
    }
}
