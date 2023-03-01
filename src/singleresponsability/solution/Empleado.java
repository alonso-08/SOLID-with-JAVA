package singleresponsability.solution;

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
    public String getNombre(){
        return  nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    public String toString(){
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                '}';
    }
}
