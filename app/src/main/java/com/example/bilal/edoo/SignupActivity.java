package com.example.bilal.edoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button b = (Button) findViewById(R.id.buttonSignup);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
                finish();
            }
        });


        //spinner for country
        Spinner spinner = (Spinner)findViewById(R.id.spinnerCountry);

        //spinner drop down elements
        List<String> country = new ArrayList<>();
        country.add("Select Country");
        country.add("Pakistan");
        country.add("Saudi Arabia");
        country.add("Srilanka");
        country.add("WestIndies");
        country.add("INDIA");
        country.add("England");
        country.add("South Africa");
        country.add("New Zeland");

        // Creating adapter for spinenr
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, country);

        //Drop down layout style - list view with radio button
        dataAdapter2.setDropDownViewResource (android.R.layout.simple_selectable_list_item);
        //attaching data adapter to spinner
        spinner.setAdapter(dataAdapter2);
//        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        // spinner for country end

        //spinner language
        Spinner spinner1 = (Spinner)findViewById(R.id.spinnerlanguage);
        //spinner drop down elements
        List<String> language= new ArrayList<>();
        language.add("Select language");
        language.add("Arabic");
        language.add("Chinese");
        language.add("Dutch");
        language.add("English");
        language.add("French");
        language.add("German");
        language.add("Hindi");
        language.add("Italian");
        language.add("Russian");
        language.add("Spanish");
        language.add("Turkish");
        language.add("Urdu");
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, language);

        //Drop down layout style - list view with radio button
        dataAdapter3.setDropDownViewResource (android.R.layout.simple_selectable_list_item);
        //attaching data adapter to spinner
        spinner1.setAdapter(dataAdapter3);
    }
}
