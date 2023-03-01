package singleresponsability.problem;

public class Main {
    public static void main(String[] args) {
        Empleado e=new Empleado("Alonso","Backend",33,30000);
        System.out.println(e.calcularImpuesto());
        e.pagarImpuesto();
    }
}