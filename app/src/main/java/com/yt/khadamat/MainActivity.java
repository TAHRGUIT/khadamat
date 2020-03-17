package com.yt.khadamat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String arrayName [] = {
            "plumber","electrician","carpenter","mechanic"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = findViewById(R.id.circleMenu);
        circleMenu.setMainMenu(Color.parseColor("#cdcdcd"),R.drawable.menu,R.drawable.close)
                .addSubMenu(Color.parseColor("#e67e22"),R.drawable.plumber)
                .addSubMenu(Color.parseColor("#d35400"),R.drawable.electrician)
                .addSubMenu(Color.parseColor("#e74c3c"),R.drawable.carpenter)
                .addSubMenu(Color.parseColor("#2c3e50"),R.drawable.mechanic)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(MainActivity.this, arrayName[index], Toast.LENGTH_SHORT).show();
                    }
                });



    }
}
