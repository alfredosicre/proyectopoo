package com.objetos;

public class Coche {


    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMaxima;

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

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) throws Exception{
    
        if (velocidad > 180) {
            throw new Exception("La velocidad no puede ser mas de " + velocidadMaxima);
        }else{
            this.velocidad = velocidad;
        }
    }

    public int getvelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setvelocidadMaxima(int velocidadMaxima) throws Exception {

        if (velocidadMaxima > 180) {
            throw new Exception("La velocidad maxima no puede ser mas de " + velocidadMaxima);
        }else{
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    // creamos un metodo Arrancar:
    
    
}
