/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysejercicio7;

import numbers.EntradaNumeros;

/**
 *
 * @author casa
 */
public class Entrada {
    Empleado tablaEmpleados[];
    Categoria tablaCategorias[];
    

    public Entrada() {
        inicializarTablaCategorias();
        
    }
    
    private void inicializarTablaCategorias(){
        tablaCategorias=new Categoria[]{
            new Categoria(6, 7.5f, "Administrativo"),
            new Categoria(8, 10.5f, "Programador"),
            new Categoria(10, 15, "Analista"),
            new Categoria(15, 20, "Analista Programador"),
            new Categoria(20, 25, "Jefe Junior"),
            new Categoria(25, 30, "Jefe Senior"),
        };
    }
    
    public void inputTablaEmpleaos(){
        int numEmpleados=EntradaNumeros.numIntGrater("Introduce el número de empleados", 1);
        
        
    }
    
    public void printTablaCategorias(){
            System.out.println("\t\tTabla de categorias");
        for(int i=0;i<tablaCategorias.length;i++){
            System.out.println((i+1)+". "+tablaCategorias[i].getCategoria());
        }
    }
    
    
}
