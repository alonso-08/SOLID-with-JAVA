package openclosed.problem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Producto> productos=new ArrayList<Producto>();
        productos.add(new Producto("Papas",1,12.5));
        productos.add(new Producto("Analgesico",2,23.40));
        productos.add(new Producto("Tomate",1,30));
        productos.add(new Producto("Manzana",1,25));
        productos.add(new Producto("Antibiotico",2,89));
        productos.add(new Producto("Antiacido",2,43));

        Tienda tienda=new Tienda(productos);
        tienda.calcularInventario();
    }
}
