
package co.uniminuto.edu.interfaz.clases;

import static co.uniminuto.edu.Interfaces.interfaz.IProducto.ivaAplicado;
import java.util.Scanner;

/**
 *
 * @author Grupo
 */
public class Despensa extends OrdenCompra{

   @Override
    public void seleccionProducto() {
        Scanner read = new Scanner(System.in);
        double cantidadCompra =0;
        System.out.println("Bienvenido a la secccion de Productos de Despensa");
        System.out.println("Seleccione el tipo de producto que desea comprar: ");
        System.out.println("Para comprar Cereal presione        1)");
        System.out.println("Para comprar Arroz presione         2)");
        System.out.println("Para comprar Huevos presione        3)");
        System.out.println("Para comprar Leche Dental presione  4)");
        System.out.println("Para comprar Carne presione         5)");
        this.idProducto = read.nextInt();
        
        switch (idProducto){
        
            case 1:
            {
            
            this.idProducto = 1;
            this.nombrePro= "Cereal";
            this.precioUnitario = 6000;
            this.precioVenta = 7500;
            this.tipoProducto = "Despensa";
            this.descripcionPro = "Cereal integral";
            
            System.out.println("Cuantas cajas desea comprar: ");
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
            this.nombrePro= "Arroz";
            this.precioUnitario = 30000;
            this.precioVenta = 35000;
            this.tipoProducto = "Despensa";
            this.descripcionPro = "Arroba de Arroz";
            
            System.out.println("Cuantas arrobas desea comprar: ");
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
            this.nombrePro= "Huevos";
            this.precioUnitario = 17000;
            this.precioVenta = 18000;
            this.tipoProducto = "Despensa";
            this.descripcionPro = "Cubeta de huevos";
            
            System.out.println("Cuantas Cubetas desea comprar: ");
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
            this.nombrePro= "Leche";
            this.precioUnitario = 17000;
            this.precioVenta = 18000;
            this.tipoProducto = "Despensa";
            this.descripcionPro = "Caja de 12 unidades de Leche";
            
            System.out.println("Cuantas Cajas de leche desea comprar: ");
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
            this.nombrePro= "Carne";
            this.precioUnitario = 10000;
            this.precioVenta = 12000;
            this.tipoProducto = "Despensa";
            this.descripcionPro = "Libra de carne";
            
            System.out.println("Cuantos libras de carne desaea comprar: ");
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
