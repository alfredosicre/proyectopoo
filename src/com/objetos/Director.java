package com.objetos;

public class Director extends Empleado  {

    public Director() { // estamos llamando al constructor vacio de Empleado

        this.setSalarioMinimo(1400);
        System.out.println("Salario Director");
    }
    
}
