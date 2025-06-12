import com.objetos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Probando la clase Persona");

        // instanciamos el objeto Persona
        Persona person = new Persona();
        
        // ya podemos utilizar a Persona
        person.nombre = "Lucas";
        person.apellidos = "Lopez";
        person.edad = 29;

        System.out.println(person.nombre + " " + person.apellidos + " " + " Edad: " + person.edad);
   
        
    }
}
