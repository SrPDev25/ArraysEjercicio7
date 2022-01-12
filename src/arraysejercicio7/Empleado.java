/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysejercicio7;

import numbers.Fecha;

/**
 *
 * @author casa
 */
public class Empleado {
    String nombre;
    Fecha fechaAlta;
    int categoria, numHijos,numHorasSemanales;

    public Empleado(String nombre, Fecha fechaAlta, int categoria, int numHijos, int numHorasSemanales) {
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.categoria = categoria;
        this.numHijos = numHijos;
        this.numHorasSemanales = numHorasSemanales;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public int getNumHorasSemanales() {
        return numHorasSemanales;
    }
    
    
    
}
