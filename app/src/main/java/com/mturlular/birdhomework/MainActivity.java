package com.mturlular.birdhomework;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int resimPozisyonu;
    TextView tvName;
    ImageView image;
    ArrayList<Kuslar> birdListe = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.imageView);
        tvName = (TextView) findViewById(R.id.tvName);
    }


    public void serce(View view) {
        Kuslar serce = new Kuslar("Karışık","Serçe","Tuvaletini kutuya yapıyor",2);
        resimPozisyonu = serce.getResimPozisyonu();
        if (resimPozisyonu == 2){
            image.setImageResource(R.drawable.serce);
            String stSerce = "Rengi : " + serce.getRengi() + "\n" + "Türü : " + serce.getTur() + "\n" + "Özelliği : " + serce.getOzellik();
            tvName.setText(stSerce);
        }
    }

    public void saka(View view) {
        Kuslar saka = new Kuslar("Karışık","Saka","Ölü taklidi yapabiliyor",3);
        resimPozisyonu = saka.getResimPozisyonu();
        if (resimPozisyonu == 3){
            image.setImageResource(R.drawable.saka);
            String stSaka = "Rengi : " + saka.getRengi() + "\n" + "Türü : " + saka.getTur() + "\n" + "Özelliği : " + saka.getOzellik();
            tvName.setText(stSaka);
        }
    }

    public void guvercin(View view) {
        Kuslar guvercin = new Kuslar("Beyaz","Güvercin","Takla atabiliyor",1);
        resimPozisyonu = guvercin.getResimPozisyonu();
        if (resimPozisyonu == 1){
            image.setImageResource(R.drawable.guvercin);
            String stGuvercin = "Rengi : " + guvercin.getRengi() + "\n" + "Türü : " + guvercin.getTur() + "\n" + "Özelliği : " + guvercin.getOzellik();
            tvName.setText(stGuvercin);
        }
    }
}
