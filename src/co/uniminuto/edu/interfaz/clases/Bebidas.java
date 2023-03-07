
package co.uniminuto.edu.interfaz.clases;

import static co.uniminuto.edu.Interfaces.interfaz.IProducto.ivaAplicado;
import java.util.Scanner;

/**
 *
 * @author Grupo
 */
public class Bebidas extends OrdenCompra{

     @Override
    public void seleccionProducto() {
        Scanner read = new Scanner(System.in);
        double cantidadCompra =0;
        System.out.println("Bienvenido a la secccion de Productos de Bebidas");
        System.out.println("Seleccione el tipo de producto que desea comprar: ");
        System.out.println("Para comprar Coca cola presione  1)");
        System.out.println("Para comprar Postobon  presione  2)");
        System.out.println("Para comprar Jugo hit  presione  3)");
        System.out.println("Para comprar Agua      presione  4)");
        System.out.println("Para comprar Sprite    presione  5)");
        this.idProducto = read.nextInt();
        
        switch (idProducto){
        
            case 1:
            {
            
            this.idProducto = 1;
            this.nombrePro= "Coca cola";
            this.precioUnitario = 2000;
            this.precioVenta = 2500;
            this.tipoProducto = "Bebidas";
            this.descripcionPro = "Cocacola Personal";
            
            System.out.println("Cuantos Unidades desea comprar: ");
            cantidadCompra = read.nextDouble();
            System.out.println("Costo del producto sin Iva es de = "+this.precioVenta );
            System.out.println("Nombre del producto              = "+this.nombrePro );
            System.out.println("ID del producto                  = "+this.idProducto );
            System.out.println("Descripcion                      = "+this.descripcionPro );
            System.out.println();            
                   
            
            for (int i = 1; i<= cantidadCompra ;i++ ){
            
                this.precioTotal += this.precioVenta; 
                
            }
            this.calculoIva = this.precioTotal *  ivaAplicado;
            this.totalPago = this.calculoIva + this.precioTotal;
                
            break;
            }
            case 2:
            {
            this.idProducto = 2;
            this.nombrePro= "Postobon";
            this.precioUnitario = 2000;
            this.precioVenta = 2300;
            this.tipoProducto = "Bebidas";
            this.descripcionPro = "Postobon Manzana";
            
            System.out.println("Cuantos Unidades desea comprar: ");
            cantidadCompra = read.nextDouble();
            System.out.println("Costo del producto sin Iva es de = "+this.precioVenta );
            System.out.println("Nombre del producto              = "+this.nombrePro );
            System.out.println("ID del producto                  = "+this.idProducto );
            System.out.println("Descripcion                      = "+this.descripcionPro );
            System.out.println();
            
            for (int i = 1; i<= cantidadCompra ;i++ ){
            
                this.precioTotal += this.precioVenta; 
            }
            this.calculoIva = this.precioTotal *  ivaAplicado;
            this.totalPago = this.calculoIva + this.precioTotal;
            
            break;
            }
            case 3:
            {
            this.idProducto = 3;
            this.nombrePro= "Jugo hit";
            this.precioUnitario = 1500;
            this.precioVenta = 1900;
            this.tipoProducto = "Bebidas";
            this.descripcionPro = "Jugo hit Mora";
            
            System.out.println("Cuantos unidades desea comprar: ");
            cantidadCompra = read.nextDouble();
            System.out.println("Costo del producto sin Iva es de = "+this.precioVenta );
            System.out.println("Nombre del producto              = "+this.nombrePro );
            System.out.println("ID del producto                  = "+this.idProducto );
            System.out.println("Descripcion                      = "+this.descripcionPro );
            System.out.println();
           
            
            for (int i = 1; i<= cantidadCompra ;i++ ){
            
                this.precioTotal += this.precioVenta; 
            }
            this.calculoIva = this.precioTotal *  ivaAplicado;
            this.totalPago = this.calculoIva + this.precioTotal;
            
            break;
            }
            case 4:
            {
            this.idProducto = 4;
            this.nombrePro= "Agua";
            this.precioUnitario = 2000;
            this.precioVenta = 2200;
            this.tipoProducto = "Bebidas";
            this.descripcionPro = "Agua de vida";
            
            System.out.println("Cuantos unidades desea comprar: ");
            cantidadCompra = read.nextDouble();
            System.out.println("Costo del producto sin Iva es de = "+this.precioVenta );
            System.out.println("Nombre del producto              = "+this.nombrePro );
            System.out.println("ID del producto                  = "+this.idProducto );
            System.out.println("Descripcion                      = "+this.descripcionPro );
            System.out.println();
            
            
            for (int i = 1; i<= cantidadCompra ;i++ ){
            
                this.precioTotal += this.precioVenta; 
            }
            
            this.calculoIva = this.precioTotal *  ivaAplicado;
            this.totalPago = this.calculoIva + this.precioTotal;
            
            break;
            }
            case 5:
            {
            this.idProducto = 5;
            this.nombrePro= "Sprite";
            this.precioUnitario = 2000;
            this.precioVenta = 2300;
            this.tipoProducto = "Bebidas";
            this.descripcionPro = "Sprite Transparente";
            
            System.out.println("Cuantos Unidades desea comprar: ");
            cantidadCompra = read.nextDouble();
            System.out.println("Costo del producto sin Iva es de = "+this.precioVenta );
            System.out.println("Nombre del producto              = "+this.nombrePro );
            System.out.println("ID del producto                  = "+this.idProducto );
            System.out.println("Descripcion                      = "+this.descripcionPro );
            System.out.println();
            
            for (int i = 1; i<= cantidadCompra ;i++ ){
            
                this.precioTotal += this.precioVenta; 
            }
            this.calculoIva = this.precioTotal *  ivaAplicado;
            this.totalPago = this.calculoIva + this.precioTotal;
            
            break;
            }  
            case 6:
                System.out.println("No ha ingredasado ninguna opcion valida");
                break;
        }
    }
    
}
