package com.objetos;

public class Empleado extends Persona{ // extend Persona es para que tome la herencia de Persona

    public Empleado() { // estamos llamando al constructor vacio de Persona

        super();
        this.salarioMinimo = 1200;
        System.out.println("Salario Empleado");
    }

    //public Empleado(String nombre, String apellidos){ // estamos llamando al constructor no vacio de Persona

        //super(nombre, apellidos); // llamamos al constructor con parametros de persona
        //System.out.println("Constructor nombre y apellido Empleado");

    //}


    private int salarioMinimo;

    public int getSalarioMinimo() {
        return this.salarioMinimo;
    }

    public void setSalarioMinimo(int salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }
    //public int getSueldo() {
    //    return this.sueldo;
    //}

    //public void setSueldo(int sueldo) {
    //    this.sueldo = sueldo;
    //}


    
}
