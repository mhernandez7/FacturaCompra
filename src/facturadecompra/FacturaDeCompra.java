
package facturadecompra;

import co.uniminuto.edu.interfaz.clases.Aseo;
import co.uniminuto.edu.interfaz.clases.Bebidas;
import co.uniminuto.edu.interfaz.clases.CuidadoPersonal;
import co.uniminuto.edu.interfaz.clases.Despensa;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class FacturaDeCompra {

    /**
     * 3. Construir un programa donde se genere una factura de compra. Esta factura de
     *    compra se generará a partir de una orden de compra.
     */
    public static void main(String[] args) {
     
        Scanner read = new Scanner(System.in);
        int ingreso = 0;
       
        
        System.out.println("Bienvenido a la pagina: ");
        System.out.println("Para ingresar a la seccion de producos de Aseo presione             1) ");
        System.out.println("Para ingresar a la seccion de producos de Bebidas presione          2) ");
        System.out.println("Para ingresar a la seccion de producos de Cuidado Personal presione 3) ");
        System.out.println("Para ingresar a la seccion de producos de Despensa presione         4) ");
        System.out.println("Para ingresar a la seccion de producos de Papeleria presione        5) ");
        System.out.println("Para ingresar a la seccion de producos de Snacks presione           6) ");
        ingreso = read.nextInt();
        
        switch (ingreso){
        
            case 1:{
                Aseo();
            break;
            }
            case 2:{
                Bebidas();
            break;
            }
            case 3:{
                CuidadoPersonal();
            break;
            }
            case 4:{
                Despensa();
            break;
            }
            case 5:{
                Papeleria();
                
            break;
            }
            case 6:{
                
                Snacks();
            break;
            }
            case 7:{
                
                System.out.println("No ha digitado una opcion valida. "
                        + "vuelva a ingresar");
            break;
            }
     
        }
 
    }
    public static void Aseo(){
     Aseo proAseo = new Aseo();
        proAseo.solicitudDatos();
        proAseo.seleccionProducto();
        proAseo.validacionProducto();
    
    }
    public static void Bebidas(){
    Bebidas bebidas = new Bebidas();
    
        bebidas.solicitudDatos();
        bebidas.seleccionProducto();
        bebidas.validacionProducto();
    
    }
    public static void CuidadoPersonal(){
    CuidadoPersonal personal = new CuidadoPersonal();
    
        personal.solicitudDatos();
        personal.seleccionProducto();
        personal.validacionProducto();
    
    }
    public static void Despensa(){
    Despensa despensa = new Despensa();
    
        despensa.solicitudDatos();
        despensa.seleccionProducto();
        despensa.validacionProducto();
    }
    public static void Papeleria(){}
    public static void Snacks(){}
    
}
