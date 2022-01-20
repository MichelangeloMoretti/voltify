package com.example.applicazione;

import java.util.ArrayList;

public class gestionebrani<listabrani> {
ArrayList<brano> ListaBrani;
public gestionebrani() {}listabrani = new ArrayList<brano>{};

    public void ListaBrani(){
        StringBuilder stBui = new StringBuilder();
        for(brano brV : ListaBrani){
            stBui.append(brV.toString());
        }
        public void AggiungiBrano(String titolo){
            brano br = new brano(titolo);
            listabrani.add(br);
        }

    }
}
