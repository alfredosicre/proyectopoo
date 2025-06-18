package com.objetos;

public class Mes {

    private String nombreMes;
    private int tempMaxima;
    private int temMinima;

    // creamos el metodo para calcular la temperatura media

    public double mediaTemperatura(){
        return ((this.tempMaxima + this.temMinima) / 2);
    }

    @Override
    public String toString(){
        return "Mes: " + this.nombreMes + " Max: " + this.tempMaxima + " Min: " + this.temMinima + " Avg: " + mediaTemperatura();
    }

    public String getNombreMes() {
        return this.nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public int getTempMaxima() {
        return this.tempMaxima;
    }

    public void setTempMaxima(int tempMaxima) {
        this.tempMaxima = tempMaxima;
    }

    public int getTemMinima() {
        return this.temMinima;
    }

    public void setTemMinima(int temMinima) {
        this.temMinima = temMinima;
    }
    
    
    
}
