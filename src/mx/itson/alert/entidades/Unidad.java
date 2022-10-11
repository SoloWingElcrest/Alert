/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.alert.entidades;

/**
 * Entidad de unidades desplegadas
 * @author Xylan
 */
public class Unidad {
    private String nombre;
    private int numIntegrante;
    private String tipo;
    private String equipamento;

        /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
        /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }
        /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        /**
     * @return the equipamiento
     */
    public String getEquipamento() {
        return equipamento;
    }
        /**
     * @param equipamiento the equipamiento to set
     */
    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
        /**
     * @return the numIntegrante
     */
    public int getNumIntegrante() {
        return numIntegrante;
    }
        /**
     * @param numIntegrante the numIntegrante to set
     */
    public void setNumIntegrante(int numIntegrante) {
        this.numIntegrante = numIntegrante;
    }    
}
