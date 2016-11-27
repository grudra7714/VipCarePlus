package com.core.vipcareplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class abuseform extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abuseform2);
        Button save = (Button)findViewById(R.id.save_abuse_form);
        LinearLayout record = (LinearLayout)findViewById(R.id.record_ll);
        record.setOnClickListener(this);

        save.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.save_abuse_form:
//                Toast.makeText(getApplicationContext(), "SAVING...", Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(), "SAVED", Toast.LENGTH_LONG).show();
                LayoutInflater inflater = getLayoutInflater();
                View toastLayout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.setView(toastLayout);
                toast.show();
                break;
            case R.id.record_ll:
                LayoutInflater inflater1 = getLayoutInflater();
                View toastLayout1= inflater1.inflate(R.layout.custom_record_toast, (ViewGroup) findViewById(R.id.custom_toast_layout_record));

                Toast toast1 = new Toast(getApplicationContext());
                toast1.setDuration(Toast.LENGTH_LONG);
                toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast1.setView(toastLayout1);
                toast1.show();
                break;
        }
    }
}
