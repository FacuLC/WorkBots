package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPerosonas;
    
    static{// bloque de inicialización estático
        System.out.println("Ejecución del bloque estático");
        ++Persona.contadorPerosonas;
        //idPersona=10;No es estátivo por esto tenemos un error
    }
    
     { 
         System.out.println("Ejecución del bloque NO estático");
         this.idPersona =Persona.contadorPerosonas++;//incrementamos el atributo.
       }
     
     public Persona (){
         System.out.println("Ejecución del constructor");
     }
     
     public int getIdePersona(){
         return this.idPersona;
     }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
         
     
}
