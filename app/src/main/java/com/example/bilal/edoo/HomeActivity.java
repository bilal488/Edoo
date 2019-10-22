package com.example.bilal.edoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class HomeActivity extends AppCompatActivity {

    ///////////////////    Grid View    ////////////////////////////
    GridView gridView;

    String[] values = {

            "Discuss",
            "Calender",
            "Sales",
            "Point of..",
            "Helpdesk",
            "Inventory",
            "Manufacture",
            "Invoicing",
            "Project",
            "Employee",
            "Apps",
            "Settings",
    } ;

    int [] images = {
            R.drawable.discuss,
            R.drawable.calendar,
            R.drawable.sales,
            R.drawable.point_of,
            R.drawable.helpdesk,
            R.drawable.inventry,
            R.drawable.manufactures,
            R.drawable.invoicing,
            R.drawable.project,
            R.drawable.employees,
            R.drawable.helpdesk,
            R.drawable.sales,


    };//////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ///////////////////////////////////////   Grid View //////////////////////////////////

        gridView = (GridView) findViewById(R.id.gridview);

        GridAdapter gridAdapter = new GridAdapter(this, values, images);
        gridView.setAdapter(gridAdapter);


        ///////////////////////////////////////   Grid View //////////////////////////////////

    }
}
