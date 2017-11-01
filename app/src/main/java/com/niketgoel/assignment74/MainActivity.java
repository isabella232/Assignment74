package com.niketgoel.assignment74;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.login_username);
    }

    public void onLoginClick(View v) {


        Intent intent = new Intent(getApplicationContext(), user.class);
        intent.putExtra("username",username.getText().toString());
        startActivity(intent);


    }
}
