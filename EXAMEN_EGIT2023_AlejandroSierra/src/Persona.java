
public class Persona {
  
  private String nombre;
  private String apellidos;
  private int edad;
  
  public Persona(String nombre, String apellidos, int edad) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
  }
  
  public int cumpleanios() {
    edad = edad + 1;
    return edad;
  }
}