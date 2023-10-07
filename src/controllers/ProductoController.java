
package controllers;

import java.util.ArrayList;
import models.Producto;

public class ProductoController {
     public static ArrayList <Producto> listaProductos=new ArrayList();                
    
      public void cargarLista(){
       Producto p1=new Producto(1, "Agua", 2.50, 30) ;
       Producto p2 =new Producto(2,"Gaseosa",3.50,20);
       Producto p3 =new Producto(3,"Vino",30,20);
       Producto p4 =new Producto(4,"Piqueo Snack",3.50,15);
       Producto p5 =new Producto(5,"Chocolate",2,20);
       Producto p6 =new Producto(6,"Gatorade",3.50,20);
       Producto p7 =new Producto(7,"Doritos",3.50,20);
       Producto p8 =new Producto(8,"Cerveza",10,30);   
          
          listaProductos.add(p1);
           listaProductos.add(p2);
           listaProductos.add(p3);
           listaProductos.add(p4);
           listaProductos.add(p5);
           listaProductos.add(p6);
           listaProductos.add(p7);
           listaProductos.add(p8);
      }
 
    public int generarCodProducto() {
        return listaProductos.size() + 1;
    }
     
       
    public double obtenerPrecio(String nombre){
       for(Producto producto:ProductoController.listaProductos){
            if(nombre.equals(producto.getNombre())){
                return producto.getPrecio();                      
                    }     
    }
         return 0;
 }     
    

}
