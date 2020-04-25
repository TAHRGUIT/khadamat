package com.yt.khadamat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yt.khadamat.login_register.login;

import de.hdodenhof.circleimageview.CircleImageView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String name = getIntent().getStringExtra("Name");
        String address = getIntent().getStringExtra("Address");

        ImageView call = findViewById(R.id.call);
        ImageView mail = findViewById(R.id.mail);
        TextView fname = findViewById(R.id.Fname);
        TextView Address = findViewById(R.id.address);
        CircleImageView imge = findViewById(R.id.Profil_img);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(getApplicationContext(), login.class);
                startActivity(call);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mail = new Intent(getApplicationContext(), login.class);
                startActivity(mail);
            }
        });

        Log.d("name", name);
       if(name.equals("Yassin TAHRGUIT")){
            imge.setImageResource(R.drawable.bill_gates);
        }else if(name.equals("Anass OUJRI")){
            imge.setImageResource(R.drawable.jeff_bezos);
        }else if(name.equals("Nour eddine ELKAFFOU")){
            imge.setImageResource(R.drawable.eddison);
        }else if(name.equals("Nadir ADDAM")){
            imge.setImageResource(R.drawable.henry_ford);
        }else if(name.equals("Nouaman AYADI")){
            imge.setImageResource(R.drawable.elon_musk);
        }else if(name.equals("Said AMORSSOU")){
            imge.setImageResource(R.drawable.steve_jobs);
        }

        fname.setText(name);
       Address.setText(address);
        //image.setImageBitmap(bmp);
    }

}
