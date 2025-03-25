import java.util.Objects;

public class persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
    private String dni;
    private String direccion;

    public persona(String nombre, String apellidos, String email, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
        this.dni = dni;
    }

    public persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public persona() {
        this.nombre = "";
        this.apellidos = "";
        this.email = "";
        this.dni = "";
        this.direccion = "";
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}

    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public void cumpliranos() {
        this.edad++;
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        persona persona = (persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
