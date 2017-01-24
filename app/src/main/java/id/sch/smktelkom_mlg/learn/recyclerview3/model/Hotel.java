package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import java.io.Serializable;

/**
 * Created by Smktelkom on 10/29/2016.
 */

public class Hotel implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Hotel(String judul, String deskripsi, String lokasi, String detail, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
