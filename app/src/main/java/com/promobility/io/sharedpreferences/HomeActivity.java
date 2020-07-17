package com.promobility.io.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView tv_home_username, tv_home_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tv_home_username = findViewById(R.id.tv_home_username);
        tv_home_password = findViewById(R.id.tv_home_password);

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("MyPreferences", MODE_PRIVATE);
        String strUname = sharedPreferences.getString("Uname", null);
        String strpassword = sharedPreferences.getString("Password", null);

        tv_home_username.setText(strUname);
        tv_home_password.setText(strpassword);

    }
}
