package com.yt.khadamat.login_register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.yt.khadamat.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText mail = findViewById(R.id.et_email);
        EditText password = findViewById(R.id.et_password);
        Button login = findViewById(R.id.btn_login);
        CircleImageView facebook = findViewById(R.id.facebook);
        CircleImageView gmail = findViewById(R.id.gmail);

        TextView register = findViewById(R.id.swipeRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(getApplicationContext(), register.class);
                startActivity(register);
                finish();
            }
        });

    }
}
