
package Ejercicio01;

public class Medico {
    
    //ATRIBUTOS ENCAPSULADOS
    private String nombre;
    private String especialidad;
    private int edad;
    private String hospitalAsignado;
    
    //METODO CONSTRUCTOR
    public Medico(String nombre, String especialidad, int edad, String hospitalAsignado) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
        this.hospitalAsignado = hospitalAsignado;
    }
    
    //METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHospitalAsignado() {
        return hospitalAsignado;
    }

    public void setHospitalAsignado(String hospitalAsignado) {
        this.hospitalAsignado = hospitalAsignado;
    }
}
