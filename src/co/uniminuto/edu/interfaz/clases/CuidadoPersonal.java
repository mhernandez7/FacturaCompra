
package co.uniminuto.edu.interfaz.clases;

import static co.uniminuto.edu.Interfaces.interfaz.IProducto.ivaAplicado;
import java.util.Scanner;

/**
 *
 * @author Grupo
 */
public class CuidadoPersonal extends OrdenCompra{

   
     @Override
    public void seleccionProducto() {
        Scanner read = new Scanner(System.in);
        double cantidadCompra =0;
        System.out.println("Bienvenido a la secccion de Cuidado Personal");
        System.out.println("Seleccione el tipo de producto que desea comprar: ");
        System.out.println("Para comprar Crema facial presione      1)");
        System.out.println("Para comprar Protector solar presione   2)");
        System.out.println("Para comprar Locion presione            3)");
        System.out.println("Para comprar Maquillaje Dental presione 4)");
        System.out.println("Para comprar Ampollas presione          5)");
        this.idProducto = read.nextInt();
        
        switch (idProducto){
        
            case 1:
            {
            
            this.idProducto = 1;
            this.nombrePro= "Crema facial ";
            this.precioUnitario = 5000;
            this.precioVenta = 5500;
            this.tipoProducto = "Cuidado Personal";
            this.descripcionPro = "Crema facial contra arrugas";
            
            System.out.println("Cuantas Unidades desea comprar: ");
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
            this.nombrePro= "Protector solar";
            this.precioUnitario = 9000;
            this.precioVenta = 9800;
            this.tipoProducto = "Cuidado Personal";
            this.descripcionPro = "Protector solar andaluz";
            
            System.out.println("Cuantas Unidades desea comprar: ");
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
            this.nombrePro= "Locion";
            this.precioUnitario = 20000;
            this.precioVenta = 22000;
            this.tipoProducto = "Cuidado Personal";
            this.descripcionPro = "Locion acaramelada";
            
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
            this.nombrePro= "Maquillaje";
            this.precioUnitario = 6000;
            this.precioVenta = 6900;
            this.tipoProducto = "Cuidado Personal ";
            this.descripcionPro = "Maquillaje piel 5b";
            
            System.out.println("Cuantas unidades desea comprar: ");
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
            this.nombrePro= "Ampollas";
            this.precioUnitario = 2000;
            this.precioVenta = 2500;
            this.tipoProducto = "Aseo";
            this.descripcionPro = "Ampolletas para heridas";
            
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
