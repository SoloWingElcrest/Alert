/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.alert.entidades;

/**
 *
 * @author Xylan
 */
public class Unidad {
    private String nombre;
    private int numIntegrante;
    private String tipo;
    private String equipamento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
        public int getNumIntegrante() {
        return numIntegrante;
    }

    public void setNumIntegrante(int numIntegrante) {
        this.numIntegrante = numIntegrante;
    }    
}
