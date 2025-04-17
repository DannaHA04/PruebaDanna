
package Laboratorio;

public class Alumno {
   
    //ATRIBUTOS
    private String Nombre;
    private double T1, T2, T3, EF, Promedio;
    private String SituacionAcademica;
    
    //METODO CONSTRUCTOR

    public Alumno(String Nombre, double T1, double T2, double T3, double EF) {
        this.Nombre = Nombre;
        this.T1 = T1;
        this.T2 = T2;
        this.T3 = T3;
        this.EF = EF;
    }
    
    //METODO GET Y SET

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getT1() {
        return T1;
    }

    public void setT1(double T1) {
        this.T1 = T1;
    }

    public double getT2() {
        return T2;
    }

    public void setT2(double T2) {
        this.T2 = T2;
    }

    public double getT3() {
        return T3;
    }

    public void setT3(double T3) {
        this.T3 = T3;
    }

    public double getEF() {
        return EF;
    }

    public void setEF(double EF) {
        this.EF = EF;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    public String getSituacionAcademica() {
        return SituacionAcademica;
    }

    public void setSituacionAcademica(String SituacionAcademica) {
        this.SituacionAcademica = SituacionAcademica;
    }
    
    
    
    //Metodo Adicional
    public void CalcularPromedio(){
         
        Promedio = (T1 * 0.10) + (T2 * 0.20) + (T3 * 0.30) + (EF *0.40);
    }
    
    public void SituacionAcademica(){
        
        if(Promedio >= 12){
            SituacionAcademica = "Aprobo";
        }
        else{
            SituacionAcademica = "Desaprobo";
        }        
    } 
     
}
