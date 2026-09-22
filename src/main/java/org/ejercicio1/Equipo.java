package org.ejercicio1;

import java.time.LocalDate;

public abstract class Equipo {
    private String codigo;
    private String marca;
    private String modelo;
    private int anio;
    private double tarifaBaseDia;
    private LocalDate fechaIngreso;
    private Categoria categoria;

    //Constructor


    public Equipo(String codigo, String marca, String modelo, int anio, double tarifaBaseDia, LocalDate fechaIngreso) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tarifaBaseDia = tarifaBaseDia;
        this.fechaIngreso = fechaIngreso;
    }

    //Getter&Setter


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getTarifaBaseDia() {
        return tarifaBaseDia;
    }

    public void setTarifaBaseDia(double tarifaBaseDia) {
        this.tarifaBaseDia = tarifaBaseDia;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    //Metodos


}
