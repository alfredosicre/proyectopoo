package com.objetos;

public class PersonaDni {

    // creamos una propiedad
    private String dni;

    public String getDni() {
        return this.dni;
    }

    // para ver si el dni es correcto, lo tenemos que hacer aqui
    public void setDni(String dni) throws Exception {
        char letraDni = dni.charAt(dni.length() - 1);
        String temp = dni.substring(0, dni.length() - 1);
        int numeroDni = Integer.parseInt(temp);
        int resultado = (numeroDni - (numeroDni / 23) * 23);
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        char letra = letrasDni.charAt(resultado);

        if (letraDni == letra){
                this.dni = dni;
        }else{
                throw new Exception("Su DNI es incorrecto, su letra es " + letra);
        }

        

    }

}
