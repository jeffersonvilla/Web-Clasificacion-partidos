package com.championship.championshipservices.model;

import javax.persistence.*;

@Entity
@Table(name = "equipos")
public class Teams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String nombreDelEquipo;
    public int numeroDePartidosJugados;
    public int numeroVictorias;
    public int numeroDerrotas;
    public int numeroEmpates;
    public int puntos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDelEquipo() {
        return nombreDelEquipo;
    }

    public void setNombreDelEquipo(String nombreDelEquipo) {
        this.nombreDelEquipo = nombreDelEquipo;
    }

    public int getNumeroDePartidosJugados() {
        return numeroDePartidosJugados;
    }

    public void setNumeroDePartidosJugados(int numeroDePartidosJugados) {
        this.numeroDePartidosJugados = numeroDePartidosJugados;
    }

    public int getNumeroVictorias() {
        return numeroVictorias;
    }

    public void setNumeroVictorias(int numeroVictorias) {
        this.numeroVictorias = numeroVictorias;
    }

    public int getNumeroDerrotas() {
        return numeroDerrotas;
    }

    public void setNumeroDerrotas(int numeroDerrotas) {
        this.numeroDerrotas = numeroDerrotas;
    }

    public int getNumeroEmpates() {
        return numeroEmpates;
    }

    public void setNumeroEmpates(int numeroEmpates) {
        this.numeroEmpates = numeroEmpates;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "id=" + id +
                ", nombreDelEquipo='" + nombreDelEquipo + '\'' +
                ", numeroDePartidosJugados=" + numeroDePartidosJugados +
                ", numeroVictorias=" + numeroVictorias +
                ", numeroDerrotas=" + numeroDerrotas +
                ", numeroEmpates=" + numeroEmpates +
                ", puntos=" + puntos +
                '}';
    }
}
