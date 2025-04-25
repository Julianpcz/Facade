/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

/**
 *
 * @author Estudiantes
 */
public class EnvioApi {
      public void buscarEnvios(String FechaEnt,String Origen, String Destino, String FechaEnv){
    
    System.out.println("=======================================");
    System.out.println("Envios encontrados: ");
    System.out.println( ", Origen del producto: " + Origen + ",Fecha de envio: " + FechaEnv + ", Destino de llegada: " + Destino + ", Fecha de entrega: " + FechaEnt);
    System.out.println("=======================================");
    }
}
