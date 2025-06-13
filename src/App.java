import com.objetos.Persona;

public class App {
    public static void main(String[] args){
        
        System.out.println("Probando la clase Persona");

        try{

        // instanciamos el objeto Persona
        Persona person = new Persona(); // llamamos a la clase Persona.java
        
        // ya podemos utilizar a Persona.java
        person.setNombre("Lucas");
        person.setApellidos("Lopez");
        person.setEdad(45);
        person.setGenero(Persona.tipoGenero.MASCULINO);
        person.setDni(2211537);
    

        System.out.println(person.getNombre() + " " + person.getApellidos() + " " + " Edad: " + person.getEdad() + " sexo: "+ person.getGenero());
        System.out.println("Nombre completo: " + person.getNombreCompleto());
        System.out.println("Nombre completo: " + person.getNombreCompletoMayusculas());
        System.out.println("Nombre completo: " + person.getNombreCompletoAlreves());
        System.out.println("La letra de el DNI:  " + person.getDni() +" es: " + person.getLetraDni());    


        }catch (Exception e){

            //nunca dejaremos un catch negativo
            System.out.println("Error: " + e.getMessage());
        }
           
    }

} 

// pasos a ejecutar con una base de datos
// try{
//  1- nos conectamos a la bbdd
//  2- leemos registros
//  3- cerramos la conexion
//}catch (Exception e){
//
//}finally{
//  3-cerramos la conexion
//}
