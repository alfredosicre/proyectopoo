package com.objetos;

public class Empleado extends Persona{ // extend Persona es para que tome la herencia de Persona


    // metodo para sobrescribir
    @Override
    public String toString(){
        return this.getNombreCompleto() + "Salario minimo: " + this.getSalarioMinimo();

    }

    // metodo que no se puede sobrescribir
    public final void matodoFinal(){ // la palabra final indica que no se puede sobrescribir
        System.out.println("Soy un metodo final: ");
    }

    public Empleado() { // estamos llamando al constructor vacio de Persona

        super();
        this.salarioMinimo = 1200;
        System.out.println("Salario Empleado");

    }

    public int getDiasVacaciones(){
        System.out.println("vacaciones de empleado");
        return 22;
    }

    //public Empleado(String nombre, String apellidos){ // estamos llamando al constructor no vacio de Persona

        //super(nombre, apellidos); // llamamos al constructor con parametros de persona
        //System.out.println("Constructor nombre y apellido Empleado");

    //}

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
