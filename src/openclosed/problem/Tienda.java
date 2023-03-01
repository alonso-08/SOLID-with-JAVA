package openclosed.problem;

import java.util.List;

public class Tienda {
    private List<Producto> productos;

    public Tienda(List<Producto> productos){
        this.productos=productos;
    }

    public void calcularInventario(){
        double total=0;

        for (Producto producto : productos){
            if(producto.getCategoria()==1){
                double nuevoPrecio=producto.getPrecio()*0.80;
                producto.setPrecio(nuevoPrecio);
                System.out.println(producto.toString());
                total+=producto.getPrecio();
            }
            if(producto.getCategoria()==2){
                double nuevoPrecio=producto.getPrecio()*1.2;
                producto.setPrecio(nuevoPrecio);
                System.out.println(producto.toString());
                total+=producto.getPrecio();
            }
        }
        System.out.println("Total en inventario es: "+String.valueOf(total));
    }
}
