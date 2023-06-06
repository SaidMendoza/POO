package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class RocketLeague {
    private int id;
    private String gamertag;
    private String club;
    private String auto;
    private String liga;
    private String url;

    public RocketLeague() {
    }

    public RocketLeague(int id, String gamertag, String club, String auto, String liga, String foto) {
        this.id = id;
        this.gamertag = gamertag;
        this.club = club;
        this.auto = auto;
        this.liga = liga;
        this.url = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGamertag() {
        return gamertag;
    }

    public void setGamertag(String gamertag) {
        this.gamertag = gamertag;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getFoto() {
        return url;
    }

    public void setFoto(String foto) {
        this.url = foto;
    }

    @Override
    public String toString() {
        return "RocketLeague{" +
                "id=" + id +
                ", gamertag='" + gamertag + '\'' +
                ", club='" + club + '\'' +
                ", auto='" + auto + '\'' +
                ", liga='" + liga + '\'' +
                ", foto='" + url + '\'' +
                '}';
    }
    public ImageIcon getImagen() throws MalformedURLException {
        URL urlImagen = new URL(this.url);
        return new ImageIcon(urlImagen);
    }
}
