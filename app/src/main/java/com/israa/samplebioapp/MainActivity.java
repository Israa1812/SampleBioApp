package com.israa.samplebioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

 private EditText edtHobbies;
 private TextView txtHobbies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        edtHobbies = findViewById(R.id.edtHabbies);
        txtHobbies = findViewById(R.id.txtHobbies);
    }

    public void btn_onclick(View view) {
        String hobbies = edtHobbies.getText().toString();
        txtHobbies.setText(hobbies);
        txtHobbies.setVisibility(View.VISIBLE);
        InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);

    }
}