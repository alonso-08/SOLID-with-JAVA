package openclosed.problem.solution;

public class InventarioAlimento  extends BaseInventario{

    public InventarioAlimento(Producto producto){
        super(producto);
    }
    public double calcularProducto(){
        double nuevoPrecio=producto.getPrecio()*0.80;
        producto.setPrecio(nuevoPrecio);
        return producto.getCategoria();
    }
}
