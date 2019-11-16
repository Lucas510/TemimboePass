package datos;

import java.util.ArrayList;

public class Estudiante {

    // Se declaran lso atributos del estudiante
    private String nombreApellido;
    private String mail;
    private String password;
    private String telefono;

    private static Estudiante estudianteLogueado;
    private static ArrayList<Estudiante> estudiantes;

    //Creamos un nuevo estudiante
    static {
        estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Lucas", "lucas.arce@upa.edu.py",
                "lucas1", "0991273747"));
    }

    // Constructor estudiante, incicializamos los atributos, para asegurarnos que los objetos
    // siempre contengan valores válidos.
    public Estudiante(String nombreApellido, String mail, String password, String telefono) {
        this.nombreApellido = nombreApellido;
        this.mail = mail;
        this.password = password;
        this.telefono = telefono;
    }

    // lista de estudiantes en el cual se le pedira el mail y la contrasena para poder loguearse
    public static ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

