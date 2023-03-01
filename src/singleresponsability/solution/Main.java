package singleresponsability.solution;

import singleresponsability.solution.Empleado;

public class Main {
    public static void main(String[] args) {
        Empleado p=new Empleado("Pedro","Contador",23,23344);
        System.out.println(p.toString());
        System.out.println(Hacienda.calcularImpuesto(p));
        Hacienda.pagarImpuesto(p);
    }
}