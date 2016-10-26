package com.example.seddik.gestiondecontact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Accueil extends AppCompatActivity implements View.OnClickListener{

public static ArrayList <Contact> mesContact = new ArrayList<Contact>();
    private Button b_acc_Ajout;
    private Button b_acc_rech;
    private Button b_acc_afficher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        b_acc_Ajout = (Button) findViewById(R.id.b_acc_Ajouter);
        b_acc_afficher = (Button) findViewById(R.id.b_acc_afficher);
        b_acc_rech = (Button) findViewById(R.id.b_acc_Recherche);


              b_acc_Ajout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
             Intent i = new Intent(Accueil.this,AjoutActivity.class);
                startActivity(i);
            }});


            b_acc_rech.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Accueil.this,RechercherActivity.class);
                    startActivity(i);
                }});



    }

    @Override
    public void onClick(View v) {

    }
}
