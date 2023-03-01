package openclosed.problem.solution;

public class Producto {
    private String nombre;
    private Integer categoria;
    private Double precio;

    public Producto(String nombre, Integer categoria, double precio) {
        this.nombre = nombre;
        this.categoria=categoria;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    @Override
    public String toString(){
        return "" +
                "El producto : '" + nombre + '\'' +
                " cuesta : " + precio ;
    }
}
