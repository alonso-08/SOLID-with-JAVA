package openclosed.problem.solution;

import java.util.List;

public class Tienda {
    private List<BaseInventario> productos;
    public Tienda(List<BaseInventario> productos){
        this.productos=productos;
    }
    public void calcularInventario(){
        double total=0;
        for(BaseInventario producto:productos){
            producto.calcularProducto();
            System.out.println(producto.toString());
            total+=producto.producto.getPrecio();
        }
        System.out.println("Total en inventario es:"+ total);
    }
}
