
package Ejercicio01;

import java.util.ArrayList;

public class MantenimientoMedico {
    
    //ARREGLO DE OBJETOS CON LA CLASE MEDICO
    private ArrayList<Medico> listaMedico;
    
    //CONSTRUCTOR
    public MantenimientoMedico() {
        
        listaMedico = new ArrayList<>(); //objeto del arraylist
    }
    
    //METODO PARA AÑADIR ELEMENTOS AL ARRAYLIST
    //add() es para añadir los elementos
    public void agregarMedico(Medico medico){
        listaMedico.add(medico);
    }
    
    //METODO QUE OBTENGA TODA LA LISTA DE MEDICOS
    public ArrayList<Medico> obtenerMedico(){
        return listaMedico;
    }
    public Medico buscarMedicoPorNombre(String nombre) {
    for (Medico m : listaMedico) {
        if (m.getNombre().equalsIgnoreCase(nombre)) {
            return m;
        }
    }
    return null; 
    }
}
