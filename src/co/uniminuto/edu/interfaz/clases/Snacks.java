
package co.uniminuto.edu.interfaz.clases;

import static co.uniminuto.edu.Interfaces.interfaz.IProducto.ivaAplicado;
import java.util.Scanner;

/**
 *
 * @author Grupo
 */
public class Snacks extends OrdenCompra{

    @Override
    public void seleccionProducto() {
        Scanner read = new Scanner(System.in);
        double cantidadCompra =0;
        System.out.println("Bienvenido a la secccion de Productos de aseo");
        System.out.println("Seleccione el tipo de producto que desea comprar: ");
        System.out.println("Para comprar Jabon presione        1)");
        System.out.println("Para comprar Desodorante presione  2)");
        System.out.println("Para comprar Shampoo presione      3)");
        System.out.println("Para comprar Crema Dental presione 4)");
        System.out.println("Para comprar Talcos presione       5)");
        this.idProducto = read.nextInt();
        
        switch (idProducto){
        
            case 1:
            {
            
            this.idProducto = 1;
            this.nombrePro= "Jabon";
            this.precioUnitario = 3000;
            this.precioVenta = 3500;
            this.tipoProducto = "Aseo";
            this.descripcionPro = "Jabon de baño";
            
            System.out.println("Cuantos jabones desea comprar: ");
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
            this.nombrePro= "Desodorante";
            this.precioUnitario = 7000;
            this.precioVenta = 11000;
            this.tipoProducto = "Aseo";
            this.descripcionPro = "Desodorante antitranspirante";
            
            System.out.println("Cuantos Desodorantes desea comprar: ");
            cantidadCompra = read.nextDouble();
            System.out.println("Costo del producto sin Iva es de = "+this.precioVenta );
            System.out.println("Nombre del producto              = "+this.nombrePro );
            System.out.println("ID del producto                  = "+this.idProducto );
            System.out.println("Descripcion                      = "+this.descripcionPro );
            System.out.println();
            
            for (int i = 1; i<= cantidadCompra ;i++ ){
            
                this.precioTotal += this.precioVenta; 
            }
            break;
            }
            case 3:
            {
            this.idProducto = 3;
            this.nombrePro= "Shampoo";
            this.precioUnitario = 15000;
            this.precioVenta = 17000;
            this.tipoProducto = "Aseo";
            this.descripcionPro = "Shampoo Tio jorge";
            
            System.out.println("Cuantos unidades de Shampoo desea comprar: ");
            cantidadCompra = read.nextDouble();
            System.out.println("Costo del producto sin Iva es de = "+this.precioVenta );
            System.out.println("Nombre del producto              = "+this.nombrePro );
            System.out.println("ID del producto                  = "+this.idProducto );
            System.out.println("Descripcion                      = "+this.descripcionPro );
            System.out.println();
           
            
            for (int i = 1; i<= cantidadCompra ;i++ ){
            
                this.precioTotal += this.precioVenta; 
            }
            break;
            }
            case 4:
            {
            this.idProducto = 4;
            this.nombrePro= "Crema Dental";
            this.precioUnitario = 4000;
            this.precioVenta = 6000;
            this.tipoProducto = "Aseo";
            this.descripcionPro = "Crema dental sin Fluor";
            
            System.out.println("Cuantos unidades de crema dental desea comprar: ");
            cantidadCompra = read.nextDouble();
            System.out.println("Costo del producto sin Iva es de = "+this.precioVenta );
            System.out.println("Nombre del producto              = "+this.nombrePro );
            System.out.println("ID del producto                  = "+this.idProducto );
            System.out.println("Descripcion                      = "+this.descripcionPro );
            System.out.println();
            
            
            for (int i = 1; i<= cantidadCompra ;i++ ){
            
                this.precioTotal += this.precioVenta; 
            }
            break;
            }
            case 5:
            {
            this.idProducto = 5;
            this.nombrePro= "Talcos";
            this.precioUnitario = 16000;
            this.precioVenta = 18000;
            this.tipoProducto = "Aseo";
            this.descripcionPro = "Talcos 2x1";
            
            System.out.println("Cuantos Desodorantes desaea comprar: ");
            cantidadCompra = read.nextDouble();
            System.out.println("Costo del producto sin Iva es de = "+this.precioVenta );
            System.out.println("Nombre del producto              = "+this.nombrePro );
            System.out.println("ID del producto                  = "+this.idProducto );
            System.out.println("Descripcion                      = "+this.descripcionPro );
            System.out.println();
            
            for (int i = 1; i<= cantidadCompra ;i++ ){
            
                this.precioTotal += this.precioVenta; 
            }
            break;
            }  
            case 6:
                System.out.println("No ha ingredasado ninguna opcion valida");
                break;
        }
    }
    
}
