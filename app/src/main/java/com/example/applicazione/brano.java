package com.example.applicazione;

import java.util.ArrayList;
import java.util.Date;

public class brano {
    public String titolo;
    private int durata;
    private String autore;
    private Date datacreazione;

    public brano (String titolo){
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
