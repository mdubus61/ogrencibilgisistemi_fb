package com.md.obs;

import java.util.HashMap;
import java.util.Map;

public class Ogrenci {
    private String ogrenciAdi;
    private String ogrenciSoyadi;
    private String ogrenciNo;
    private String bolumAdi;

    public Ogrenci(){

    }

    public Ogrenci(String ogrenciAdi, String ogrenciSoyadi, String ogrenciNo, String bolumAdi) {
        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciSoyadi = ogrenciSoyadi;
        this.ogrenciNo = ogrenciNo;
        this.bolumAdi = bolumAdi;
    }

    public String getOgrenciAdi() {
        return ogrenciAdi;
    }

    public void setOgrenciAdi(String ogrenciAdi) {
        this.ogrenciAdi = ogrenciAdi;
    }

    public String getOgrenciSoyadi() {
        return ogrenciSoyadi;
    }

    public void setOgrenciSoyadi(String ogrenciSoyadi) {
        this.ogrenciSoyadi = ogrenciSoyadi;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getBolumAdi() {
        return bolumAdi;
    }

    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }

    public String toString(){
        return "Ögrenci No:"+ogrenciNo+"\n" +
                "Ögrenci Adı: "+ogrenciAdi+"\n"+
                "Ögrenci Soyadı:"+ogrenciSoyadi+"\n"+
                "Bölüm:"+bolumAdi ;
    }
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("ogrenciNo", ogrenciNo);
        result.put("ogrenciAdi", ogrenciAdi);
        result.put("ogrenciSoyadi", ogrenciSoyadi);
        result.put("bolumAdi", bolumAdi);

        return result;
    }
}
