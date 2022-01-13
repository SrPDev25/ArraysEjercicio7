package arraysejercicio7;

import inputs.EntradaNumeros;
import inputs.EntradaTextos;
import objects.Fecha;

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

    /**
     * Inicializa la tabla pregenerada de categorias
     */
    private void inicializarTablaCategorias() {
        tablaCategorias = new Categoria[]{
            new Categoria(6, 7.5f, "Administrativo"),
            new Categoria(8, 10.5f, "Programador"),
            new Categoria(10, 15, "Analista"),
            new Categoria(15, 20, "Analista Programador"),
            new Categoria(20, 25, "Jefe Junior"),
            new Categoria(25, 30, "Jefe Senior"),};
    }

    /**
     * Genera un "formulario" de empleados
     * Se piden el numero de empleados y seguido se va rellenando la información uno a uno
     */
    public void inputTablaEmpleados() {
        Fecha fechaAlta = new Fecha();
        int numHijos, numHorasSemanales, categoria;
        String nombre;
        int numEmpleados = EntradaNumeros.numIntGrater("Introduce el número de empleados", 1);
        tablaEmpleados=new Empleado[numEmpleados];
        
        for(int i=0;i<numEmpleados;i++){
            System.out.println("\n"+"Empleado "+ (i+1));
            nombre=EntradaTextos.inputString("Nombre: ");
            printTablaCategorias();
            categoria=EntradaNumeros.numIntBetween("Categoria: ", 1, tablaCategorias.length);
            numHorasSemanales=EntradaNumeros.numIntGrater("Numero de horas trabajadas semanales: ",1);
            fechaAlta=EntradaTextos.inputFecha("Fecha de alta (dd/mm/aaaa): ");
            numHijos=EntradaNumeros.numIntGrater("Numero de hijos computables (menores de 25 años): ", 0);
            
            tablaEmpleados[i]=new Empleado(nombre,fechaAlta,categoria,numHijos,numHorasSemanales);
        }
    }

    /**
     * Genera una tabla de empleados ya predefinida (se usa para pruebas)
     */
    public void tablaEmpleadosPredefinida(){
        tablaEmpleados=new Empleado[]{
            new Empleado("Juan","12/3/2000",3,3,30),
            new Empleado("Juana","12/2/2005",1,0,45),
            new Empleado("Juane","12/5/2020",4,0,10),
            new Empleado("Juani","12/12/2017",5,0,4),
            new Empleado("J","12/4/2015",2,1,100),
            new Empleado("Uan","12/8/2010",3,0,27),
            new Empleado("Jan","12/8/2008",1,2,42),
            new Empleado("Juanito","12/10/2000",3,1,45),
        
        };

    }
    
    /**
     * Printea la tabla de categorias
     */
    public void printTablaCategorias() {
        System.out.println("\t\tTabla de categorias");
        for (int i = 0; i < tablaCategorias.length; i++) {
            System.out.println((i + 1) + ". " + tablaCategorias[i].getCategoria());
        }
    }

}
