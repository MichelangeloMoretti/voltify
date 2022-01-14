package com.example.applicazione;

public class gestionebrani {




    public void ListaBrani(){
        StringBuilder stBui = new StringBuilder();
        for(Brano brV : ListaBrani){
            stBui.append(brV.toString());
        }

    }
}
