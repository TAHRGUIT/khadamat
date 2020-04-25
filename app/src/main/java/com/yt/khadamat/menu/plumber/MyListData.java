package com.yt.khadamat.menu.plumber;

public class MyListData{
    private String nom;
    private String address;
    private int imgId;

    public MyListData(String nom, String address, int imgId) {
        this.nom = nom;
        this.address = address;
        this.imgId = imgId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}