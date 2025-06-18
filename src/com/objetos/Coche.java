package com.objetos;

public class Coche {

    // creo un constructor donde iniciamos 
    public Coche(){
        this.velocidad = 0;
        this.cocheArrancado = false;
        this.velocidadMaxima = 180;
    }


    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMaxima;

    // necesitamos una variable para ver el coche si esta arrancado o no
    protected boolean cocheArrancado;
    // metodo arrancar
    public void arrancar(){
        System.out.println("El coche ha arrancado !!!");
        this.cocheArrancado = true;
    }
    // metodo acelerar
    public int acelerar(){
        // no podemos acelerar si el coche no ha arrancado
        if (this.cocheArrancado == false) {
            System.out.println("Debe arrancar el coche primero");
            return 0;
        }else{
            this.velocidad += 20;
            if (this.velocidad > this.velocidadMaxima) {
                this.velocidad = this.velocidadMaxima;
            }
            return this.velocidad;
        }
    }
    // metodo frenar
    public int frenar(){
        this.velocidad -= 10;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
        return this.velocidad;
    }
    // metodo detener automaticamente el coche
    public int frenar(boolean atope){
        System.out.println("Frenada a tope y apagado");
        this.velocidad = 0;
        this.cocheArrancado = false;
        return 0;
    }

    // GET y los SET -------------------
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // la velocidad sera de solo lectura
    public int getVelocidad() {
        return this.velocidad;
    }
    protected void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    public int getvelocidadMaxima() {
        return this.velocidadMaxima;
    }
    // protected para que otro coche que herede pueda cambiar la velocidad maxima, en este caso los deportivos
    protected void setvelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    // sobreescribimos el metodo toString para hacer mas agradable el dibujo del coche
    @Override
    public String toString(){
        return this.marca + " " + this.modelo + " velocidad: " + this.velocidad;
    }
}
