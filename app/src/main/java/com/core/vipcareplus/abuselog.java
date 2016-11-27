package com.core.vipcareplus;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class abuselog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abuselog);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.plus_button, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

        Intent intent = new Intent(this, abuseform.class);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        return true;
    }

}
