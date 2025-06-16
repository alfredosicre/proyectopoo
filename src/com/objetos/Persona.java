package com.objetos;

public class Persona {

    // constructor lleva el nombre de la clase
    public Persona(){
        // cuando se ponga: new Persona() entra en este codigo
        System.out.println("Soy el constructor vacio de Persona !!!");
        this.setGenero(tipoGenero.FEMENINO); // inicializamos el genero siempre a FEMENINO en un principio

    }
    // otro constructor que reciba los datos que yo quiera
    public Persona(String nombre, String apellidos){
        System.out.println("Constructor con nombre y apellidos Persona");
        this.nombre = nombre;
        this.apellidos = apellidos;

    }

    // las propiedades son privadas. 
    private String nombre;
    private String apellidos;
    private int edad;
    private int dni;

    public enum tipoGenero{
        FEMENINO, MASCULINO, OTRO
    }

    private tipoGenero genero;    

    // por cada propiedad tenemos dos metodos: GET y SET:

    // GET para recuperar ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    public tipoGenero getGenero() {
        return this.genero;
    }
    public int getDni() {
        return this.dni;
    }

    // SET para establecer un valor ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setEdad(int edad) throws Exception {

        // controlamos la edad
        // 1.- error silencioso, 
        //if (edad < 0) {
        //    this.edad = 0;
        //}else{
        //    this.edad = edad;
        //}

        // controlamos la edad
        // 2.- error grave, nosotros lo controlamos 
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa");
        }else{
            this.edad = edad;
        }
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setGenero(tipoGenero genero) {
            this.genero = genero;
    }
    // ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡

    // nombre completo
    public String getNombreCompleto(){
        return this.nombre + " " + this.apellidos;
    }
    // en mayusculas
    public String getNombreCompletoMayusculas(){
        return this.nombre.toUpperCase() + " " + this.apellidos.toUpperCase();
    }
    // otro metodo para devolver el numbre completo pero alreves
    public String getNombreCompletoAlreves(){
        return this.apellidos + " " + this.nombre;
    }
    // metodo con nombre y apellidos con un separador
    public String getNombreSeparador(String separador){
        return this.nombre + " " + separador + " " + this.apellidos;
    }

    // ------------ calcula de la letra del dni -----------------
    public char getLetraDni(){

        String letraDni = "TRWAGMYFPDXBNJZSQVHLCKET";
    
        int resultado = (dni - (dni / 23) * 23);
        char letra = letraDni.charAt(resultado);
        return letra;
    
    }

    // si ponemos el minmo nombre del metodo a todos, los podemos diferencial por un nombre definido
    // public String getNombreCompleto(int numero){
    // }
    // public String getNombreCompleto(String numero){
    // }
    // public String getNombreCompleto(boolean numero){
    // }
    // lo que importa es la firma de un metodo
}
