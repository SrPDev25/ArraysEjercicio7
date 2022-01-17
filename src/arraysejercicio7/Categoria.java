/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysejercicio7;

/**
 *
 * @author casa
 */
public class Categoria {
    private float tarifaOrdinaria, tarifaExtraordinaria;
    private String categoria;

    public Categoria(float tarifaOrdinaria, float tarifaExtraordinaria, String categoria) {
        this.tarifaOrdinaria = tarifaOrdinaria;
        this.tarifaExtraordinaria = tarifaExtraordinaria;
        this.categoria = categoria;
    }

    public float getTarifaOrdinaria() {
        return tarifaOrdinaria;
    }

    public float getTarifaExtraordinaria() {
        return tarifaExtraordinaria;
    }

    public String getCategoria() {
        return categoria;
    }
    
    
}
