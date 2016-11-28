package com.core.vipcareplus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class complete_information extends AppCompatActivity {

    ListView list;
    String[] abuse = {
            "Introduction",
            "attack",
            "neglect",
            "stealing",
            "warning",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_information);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, abuse);

        ListView list = (ListView) findViewById(R.id.list_item);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch(position){
                    case 0:  Intent newActivity = new Intent(complete_information.this, introduction.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity1 = new Intent(complete_information.this, neglect.class);
                        startActivity(newActivity1);
                        break;
                    case 2:  Intent newActivity2 = new Intent(complete_information.this, attack.class);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(complete_information.this, stealing.class);
                        startActivity(newActivity3);
                        break;
                    case 4:  Intent newActivity4 = new Intent(complete_information.this, warning.class);
                        startActivity(newActivity4);
                        break;

                }

            }
            @SuppressWarnings("unused")
            public void onClick(View v){
            };
        });}
}