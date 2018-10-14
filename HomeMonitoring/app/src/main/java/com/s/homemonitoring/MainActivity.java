package com.s.homemonitoring;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button log_in = findViewById(R.id.login);
        final Button sign_up = findViewById(R.id.register);
        final EditText username = (EditText) findViewById(R.id.user);
        final EditText password = (EditText) findViewById(R.id.pass);
        final TextView message = (TextView) findViewById(R.id.message);
        log_in.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (password.getText().toString().equals("") || username.getText().toString().equals("")) {
                    message.setTextColor(Color.RED);
                    message.setText("You must fill all the fields.");

                }
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                final DatabaseReference root_reference = database.getReference().child("Users");



            }



        });
    }
}
