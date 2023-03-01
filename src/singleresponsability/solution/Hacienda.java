package singleresponsability.solution;

import singleresponsability.solution.Empleado;

public class Hacienda {
    /*
    Ahora creamos la otra clase para la otra responsabilidad del empleado
    cada clase tiene una sola responsabilidad
     */
    public static double calcularImpuesto(Empleado empleado){
        return empleado.getSueldo()*0.35;
    }
    public static void pagarImpuesto(Empleado empleado){
        double impuesto=calcularImpuesto(empleado);
        System.out.println("Se pago "+ String.valueOf(impuesto) + " en impuestos por parte de "+ empleado.getNombre());
    }
}
