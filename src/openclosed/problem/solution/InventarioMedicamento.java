package openclosed.problem.solution;

public class InventarioMedicamento extends BaseInventario {

    public InventarioMedicamento(Producto producto){
        super(producto);
    }
    public double calcularProducto(){
        double nuevoPrecio=producto.getPrecio()*1.2;
        producto.setPrecio(nuevoPrecio);
        return producto.getPrecio();
    }
}
