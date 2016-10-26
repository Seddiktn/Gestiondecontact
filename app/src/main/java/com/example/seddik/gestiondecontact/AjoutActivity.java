package com.example.seddik.gestiondecontact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AjoutActivity extends AppCompatActivity {
    private EditText ed_nom_ajout;
    private EditText ed_pre_ajout;
    private EditText ed_tel_ajout;
    private Button b_val_ajout;
    private Button b_ann_ajout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout);
        ed_nom_ajout = (EditText) findViewById(R.id.ed_nom_ajout);
        ed_nom_ajout = (EditText) findViewById(R.id.ed_pre_ajout);
        ed_tel_ajout = (EditText) findViewById(R.id.ed_tel_ajout);

        b_val_ajout = (Button) findViewById(R.id.b_val_ajout);
        b_val_ajout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Accueil.mesContact.add(new Contact(ed_nom_ajout.toString(),ed_pre_ajout.toString(),ed_tel_ajout.toString()));
                Toast.makeText(AjoutActivity.this,"Ajout avec succes",Toast.LENGTH_SHORT);
            }});





    }
}
