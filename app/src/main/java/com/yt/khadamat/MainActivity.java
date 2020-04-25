package com.yt.khadamat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.yt.khadamat.menu.plumber.plumber;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] cateNames={
            "Toutes les categories","Plombier","Électricien","Charpentier","Mécanicien"
    };

    String[] villeNames={
            "Tous le maroc","Rabat","Casablanca","Tanger"
    };

    String[] secteurNames={
            "Tous les secteurs","La Médina de Rabat","Les Oudayas","Hassan","L'Océan","Agdal","Hay Riad","Aakkari","Yacoub El Mansour","Massira"
    };
    Button btnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner cate = findViewById(R.id.category);
        cate.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,cateNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cate.setAdapter(aa);

        Spinner ville = findViewById(R.id.ville);
        ville.setOnItemSelectedListener(this);
        ArrayAdapter av = new ArrayAdapter(this,android.R.layout.simple_spinner_item,villeNames);
        av.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ville.setAdapter(av);

        Spinner sect = findViewById(R.id.secteur);
        sect.setOnItemSelectedListener(this);
        ArrayAdapter as = new ArrayAdapter(this,android.R.layout.simple_spinner_item,secteurNames);
        as.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sect.setAdapter(as);

        btnSearch = findViewById(R.id.bSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent plumber = new Intent(getApplicationContext(),plumber.class);
                startActivity(plumber);
            }
        });

    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {

       switch(arg0.getId()){
            case R.id.category:
                //Toast.makeText(getApplicationContext(), cateNames[position], Toast.LENGTH_SHORT).show();
                break;

           case R.id.ville:
               //Toast.makeText(getApplicationContext(), villeNames[position], Toast.LENGTH_SHORT).show();
               break;

            case R.id.secteur:
                //Toast.makeText(getApplicationContext(), secteurNames[position], Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

    }
}


        /*CircleMenu circleMenu = findViewById(R.id.circleMenu);
        circleMenu.setMainMenu(Color.parseColor("#cdcdcd"),R.drawable.menu,R.drawable.close)
                .addSubMenu(Color.parseColor("#e67e22"),R.drawable.plumber)
                .addSubMenu(Color.parseColor("#d35400"),R.drawable.electrician)
                .addSubMenu(Color.parseColor("#e74c3c"),R.drawable.carpenter)
                .addSubMenu(Color.parseColor("#2c3e50"),R.drawable.mechanic)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(MainActivity.this, arrayName[index], Toast.LENGTH_SHORT).show();
                        if(index == 0){
                            Intent plumber = new Intent(getApplicationContext(), com.yt.khadamat.menu.plumber.plumber.class);
                            startActivity(plumber);
                        }
                    }
                });*/