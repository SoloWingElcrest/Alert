/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.alert.entidades;

import java.util.List;
import mx.itson.alert.enmueradores.Aproximidad;

/**
 *
 * @author Xylan
 */
public class Operacion {
    private String codename;
    private String fecha;
    private int hora;
    private String clima;
    private int temperatura;
    private String Coordenada;
    private String lugar;
    private String estimacionHostil;
    private Aproximidad aproximidad;
    private List<Descripcion> descripciones;
    private List<Instruccion> instrucciones;
    private List<Unidad> unidades;
    

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getCoordenada() {
        return Coordenada;
    }

    public void setCoordenada(String Coordenadas) {
        this.Coordenada = Coordenadas;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEstimacionHostil() {
        return estimacionHostil;
    }

    public void setEstimacionHostil(String estimacionHostil) {
        this.estimacionHostil = estimacionHostil;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Aproximidad getAproximidad() {
        return aproximidad;
    }

    public void setAproximidad(Aproximidad aproximidad) {
        this.aproximidad = aproximidad;
    }

    public List<Descripcion> getDescripciones() {
        return descripciones;
    }

    public void setDescripciones(List<Descripcion> descripciones) {
        this.descripciones = descripciones;
    }

    public List<Instruccion> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(List<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }

    public List<Unidad> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<Unidad> unidades) {
        this.unidades = unidades;
    }

}
