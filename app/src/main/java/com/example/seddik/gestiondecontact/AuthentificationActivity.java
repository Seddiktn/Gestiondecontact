package com.example.seddik.gestiondecontact;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class AuthentificationActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Id to identity READ_CONTACTS permission request.
     */
    private static final int REQUEST_READ_CONTACTS = 0;

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello", "bar@example.com:world"
    };
    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */
  //  private UserLoginTask mAuthTask = null;

    // UI references.
    private EditText nom_auth;
    private EditText pass_auth;
    private ProgressBar pb_auth;
    private Button b_val_auth;
    private Button b_ann_auth;
    private TextView txt_auth;
    private int nbr_test_auth=4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);
        // Set up the login form.
        nom_auth = (EditText) findViewById(R.id.ed_nom_auth);
        pass_auth = (EditText) findViewById(R.id.ed_pass_auth);
        pb_auth = (ProgressBar) findViewById(R.id.pb_auth);
        b_val_auth = (Button) findViewById(R.id.b_val_auth);
        b_ann_auth = (Button) findViewById(R.id.b_ann_auth);
        txt_auth = (TextView) findViewById(R.id.txt_auth);
        b_val_auth.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                    if((nom_auth.getText().toString().equals("seddik@g.c"))&&(nom_auth.getText().toString().equals("123000")))
                    {
                        Intent i = new Intent(AuthentificationActivity.this, Accueil.class);
                        i.putExtra("EXTRA_Log_Name", ((nom_auth.getText()).toString()));
                       startActivity(i);
                    }
                    else
                    {
                        nbr_test_auth--;
                        pb_auth.incrementProgressBy(25);
                        txt_auth.setText("Nombre de test restant : "+nbr_test_auth);
                    }
                if (nbr_test_auth==0)
                {
                    b_val_auth.setEnabled(false);
                    b_ann_auth.setEnabled(false);

                }

                }


        });;
        b_ann_auth.setOnClickListener(this);
        txt_auth.setText("Nombre de test restant : " + nbr_test_auth);

    }

    @Override
    public void onClick(View v) {


    }

}