package com.mturlular.birdhomework;

import android.widget.ImageView;

/**
 * Created by MuratU on 11.03.2017.
 */

public class Kuslar {
    String rengi;
    String tur;
    String ozellik;
    int resimPozisyonu;

    public Kuslar(String rengi, String tur, String ozellik, int resimPozisyonu) {
        this.rengi = rengi;
        this.tur = tur;
        this.ozellik = ozellik;
        this.resimPozisyonu = resimPozisyonu;
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getOzellik() {
        return ozellik;
    }

    public void setOzellik(String ozellik) {
        this.ozellik = ozellik;
    }

    public int getResimPozisyonu() {
        return resimPozisyonu;
    }

    public void setResimPozisyonu(int resimPozisyonu) {
        this.resimPozisyonu = resimPozisyonu;
    }
}
