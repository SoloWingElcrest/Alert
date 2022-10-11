/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.alert.entidades;

import java.util.List;
import mx.itson.alert.enmueradores.Aproximidad;

/**
 * entidad de operacion actual
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
    
        /**
     * @return the codename
     */
    public String getCodename() {
        return codename;
    }
        /**
     * @param codename the codename to set
     */
    public void setCodename(String codename) {
        this.codename = codename;
    }
        /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }
        /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
        /**
     * @return the clima
     */
    public String getClima() {
        return clima;
    }
        /**
     * @param clima the clima to set
     */
    public void setClima(String clima) {
        this.clima = clima;
    }
        /**
     * @return the temperatura
     */
    public int getTemperatura() {
        return temperatura;
    }
        /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
        /**
     * @return the coordenada
     */
    public String getCoordenada() {
        return Coordenada;
    }
        /**
     * @param coordenada the coordenada to set
     */
    public void setCoordenada(String Coordenadas) {
        this.Coordenada = Coordenadas;
    }
        /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }
        /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
        /**
     * @return the estimacionHostil
     */
    public String getEstimacionHostil() {
        return estimacionHostil;
    }
        /**
     * @param estimacionHostil the estimacionHostil to set
     */
    public void setEstimacionHostil(String estimacionHostil) {
        this.estimacionHostil = estimacionHostil;
    }
        /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }
    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }
        /**
     * @return the aproximidad
     */
    public Aproximidad getAproximidad() {
        return aproximidad;
    }
        /**
     * @param aproximidad the aproximidad to set
     */
    public void setAproximidad(Aproximidad aproximidad) {
        this.aproximidad = aproximidad;
    }
        /**
     * @return the descripciones
     */
    public List<Descripcion> getDescripciones() {
        return descripciones;
    }
        /**
     * @param descripciones the descripciones to set
     */
    public void setDescripciones(List<Descripcion> descripciones) {
        this.descripciones = descripciones;
    }
        /**
     * @return the instrucciones
     */
    public List<Instruccion> getInstrucciones() {
        return instrucciones;
    }
        /**
     * @param instrucciones the instrucciones to set
     */
    public void setInstrucciones(List<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }
        /**
     * @return the unidades
     */
    public List<Unidad> getUnidades() {
        return unidades;
    }
        /**
     * @param unidades the unidades to set
     */
    public void setUnidades(List<Unidad> unidades) {
        this.unidades = unidades;
    }

}
