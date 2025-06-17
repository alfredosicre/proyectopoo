package com.objetos;

public class Director extends Empleado  {

    public void mandar {
        System.out.println("OBECEDED");
    }

    public Director() { // estamos llamando al constructor vacio de Empleado

        int salMinimo = super.getSalarioMinimo();
        
        this.setSalarioMinimo(salMinimo + 200);
        System.out.println("Salario Director");
    }
    @Override
    public int getDiasVacaciones(){
        //llamamos a la clase empleado para recuperar el 22 de vacaciones
        int vacas = super.getDiasVacaciones(); // coge las vacaciones del personal/empleado
        System.out.println("vacaciones del director");
        return vacas + 8;
    }

    
}
