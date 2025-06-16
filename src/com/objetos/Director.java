package com.objetos;

public class Director extends Empleado  {

    public Director() { // estamos llamando al constructor vacio de Empleado

        int salMinimo = super.getSalarioMinimo();
        
        this.setSalarioMinimo(salMinimo + 200);
        System.out.println("Salario Director");
    }
    
}
