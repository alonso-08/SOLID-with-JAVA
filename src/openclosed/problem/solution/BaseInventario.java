package openclosed.problem.solution;

import org.xml.sax.HandlerBase;

public abstract class BaseInventario {
    protected Producto producto;

    public BaseInventario(Producto producto){
        this.producto=producto;
    }

    public Producto GetProducto(){
        return producto;
    }
    public void setProducto(Producto producto){
        this.producto=producto;
    }
    @Override
    public String toString(){
        return producto.toString();
    }
    public abstract double calcularProducto();
}
