package openclosed.problem.solution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<BaseInventario> productos =new ArrayList<BaseInventario>();

        productos.add(new InventarioAlimento(new Producto("Papas",1,12.5)));
        productos.add(new InventarioMedicamento(new Producto("Analgesico",2,23.40)));
        productos.add(new InventarioAlimento(new Producto("Tomate",1,30)));
        productos.add(new InventarioAlimento(new Producto("Manzana",1,25)));
        productos.add(new InventarioMedicamento(new Producto("Antibiotico",2,89)));
        productos.add(new InventarioMedicamento(new Producto("Antiacido",2,43)));
        Tienda tienda=new Tienda(productos);
        tienda.calcularInventario();

    }
}
