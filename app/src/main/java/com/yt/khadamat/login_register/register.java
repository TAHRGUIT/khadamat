package com.yt.khadamat.login_register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.yt.khadamat.R;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText nom = findViewById(R.id.et_name);
        final EditText prenom = findViewById(R.id.et_prenom);
        final EditText mail = findViewById(R.id.et_email);
        final EditText call = findViewById(R.id.et_phone);
        final EditText password = findViewById(R.id.et_password);

        Button register = findViewById(R.id.btn_register);

        TextView swiplogin = findViewById(R.id.swipeLogin);

        swiplogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(getApplicationContext(), login.class);
                startActivity(login);
                finish();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(register.this, nom.getText()+" "+prenom.getText()+" "+mail.getText()+" "+call.getText()+" "+password.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
