package com.objetos;

public class Deportivo extends Coche{

    // metodo para definir la velocidad maxima del deportivo
    //public Deportivo(){
    //    this.setvelocidadMaxima(velocidadMaxima:320);
    //}
    
    
    // metodo del turvo
    public int turbo(){
        int velocidadActual = this.getVelocidad();
        this.setVelocidad(velocidadActual + 40);
        if (this.getVelocidad() > this.getvelocidadMaxima()) {
            this.setVelocidad(this.getvelocidadMaxima());
        }
        return this.getVelocidad();
    }

    // modificamos el metodo acelerar para que sea diferente
    @Override
    public int acelerar(){
        if (this.cocheArrancado == false) {
            System.out.println("Debe arrancar el deportivo primero");
            return 0;
        }else{
            int velocidadActual = this.getVelocidad();
            this.setVelocidad(velocidadActual + 50);
            if (this.getVelocidad() > this.getvelocidadMaxima()) {
                this.setVelocidad(this.getvelocidadMaxima());
            }
            return this.getVelocidad();
        }
    }
}
