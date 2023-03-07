/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.uniminuto.edu.interfaz.clases;
import co.uniminuto.edu.Interfaces.interfaz.IProducto;
import java.util.Scanner;

/**
 *
 * @author Grupo
 */
public abstract class OrdenCompra implements IProducto{
    
   protected int idProducto;
   protected String nombrePro;
   protected String aux;
   protected String descripcionPro;
   protected String aux1;
   protected double precioUnitario;
   protected double precioVenta;
   protected double aux2;
   protected double precioTotal;
   protected double aux3;
   protected double calculoIva;
   protected double aux4;
   protected double totalPago;
   protected double aux5;
   protected String tipoProducto;
   protected String nombreCliente;
   protected String apellidos;
   protected String cedula;
   protected String celular; 
   protected double numeroOrden;
   
  
     public void solicitudDatos(){
    Scanner read = new Scanner (System.in);
    
        System.out.println("Ingrese su Nombre");
        this.nombreCliente = read.next();
        System.out.println("Ingrese su Apellido");
        this.apellidos = read.next();
        System.out.println("Ingrese su cedula");
        this.cedula = read.next();
        System.out.println("Ingrese su celular");
        this.celular = read.next();   
        
     }
 
     
     public void validacionProducto(){
     
         Scanner read = new Scanner (System.in);
        int validacion =0;
        System.out.println("¿Desea adquirir otro producto ?");
        System.out.println("Para confirmar presione      1");
        System.out.println("Para salir cualquier numero:  ");
        validacion = read.nextInt();
        
        if(validacion==1)
        {
        this.seleccionProducto();
        }else 
        {        
            imprimir();
        }
     
     }
     
     public void imprimir(){
     
     
        System.out.println(" OrdenCompra ");
        System.out.println(" idProducto = "+this.idProducto);
        System.out.println();
        System.out.println(" NombreCliente = "+this.nombreCliente+       " Apellidos = "+this.apellidos);
        System.out.println(" Cedula        = "+this.cedula+                " Celular = "+this.celular);
        System.out.println();
        System.out.println(" Nombre Producto      = "+this.nombrePro);
        System.out.println(" Descripcion          = "+this.descripcionPro);
        System.out.println(" Tipo Producto        = "+this.tipoProducto);   
        System.out.println(" PrecioVenta          = "+this.precioVenta);     
        System.out.println(" Precio Total sin iva = "+this.precioTotal);
        System.out.println(" Precion Unitario     = "+this.precioUnitario);
        System.out.println(" Calculo iva          = "+this.calculoIva);
        System.out.println(" Iva aplicado         = "+ivaAplicado);
        System.out.println(" Total a Pagar        = "+this.totalPago);
        System.out.println(" Numero Orden         = "+this.numeroOrden);
        System.out.println('}');
     
     }
    public void contador(){
    
        
        
        
    
    
    }
}
