package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.modelo.*;

public class Turismo {
    public static void main(String[] args) {
        ActividadTuristica actividadTuristica = new ActividadTuristica(
            "Cartagena", "3 días", "Soleado", 
            new Destino("D001", "Avión", "Hotel"), 
            new Actividad("Tour histórico", "Juan", 20240821, 150.0, "A001"), 
            new Cliente("C001", "200000", "juan@example.com"), 
            "AT001", 2024
        );
        System.out.println(actividadTuristica);
      

        Destino destino = new Destino("D001", "Avión", "Hotel");
        System.out.println(destino);
   
        Cliente cliente = new Cliente("C001", "200000", "juan@example.com");
        System.out.println(cliente);
 

        Calificacion calificacion = new Calificacion("5 estrellas", cliente, "AT001");
        System.out.println(calificacion);

        Actividad actividad = new Actividad("Tour histórico", "Juan", 20240821, 150.0, "A001");
        System.out.println(actividad);
 ;

        Parapente parapente = new Parapente("Sí", "Negro", "Seguro", "Activo");
        System.out.println(parapente);
       
        Bucear bucear = new Bucear("Profesional", "Grande", "Neopreno");
        System.out.println(bucear);
      
    }
}