package singleresponsability.problem;

public class Empleado {
    private String nombre;
    private String puesto;
    private  int edad;
    private double sueldo;
    public Empleado(String nombre, String puesto, int edad, double sueldo){
        this.nombre=nombre;
        this.puesto=puesto;
        this.edad=edad;
        this.sueldo=sueldo;
    }
    /*
     * Ahora colocamos algo que no es responsabilidad del empleado
     * Tenemos dos razones para cambiar la clase
     * 1.- cuando cambia algo del empleado
     * 2.- cuando cambia algo del impueto
    */
    public double calcularImpuesto(){
        return sueldo*0.35;
    }
    public void pagarImpuesto(){
        double impuesto=calcularImpuesto();
        System.out.println("Se pago "+String.valueOf(impuesto)+" en impuestos por parte de "+ nombre);
    }
}
