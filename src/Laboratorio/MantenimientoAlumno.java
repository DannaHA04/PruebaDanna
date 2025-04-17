
package Laboratorio;

import java.util.ArrayList;

public class MantenimientoAlumno {
    
    //ARREGLO DE OBJETOS CON LA CLASE MEDICO
    private ArrayList<Alumno> listaAlumno;
    
    //CONSTRUCTOR
    public MantenimientoAlumno() {
        
        listaAlumno= new ArrayList<>();
    }
    
    public void AgregarAlumno(Alumno alumno){
        
        listaAlumno.add(alumno);
    }
    
    public ArrayList<Alumno> ObtenerAlumno(){
        return listaAlumno;
    }
    
}
