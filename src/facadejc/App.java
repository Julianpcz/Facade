/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadejc;

import facadejc.CheckFacade;
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("Nintendo Switch", "Japon", "Colombia", "25/04/2025", "20/05/2025", 290, "Nintendo");
                
        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("Casco Dr.Doom a escala", "Estados Unidos", "Chile", "30/03/2025", "13/05/2025", 100, "Marvel Entretainment");
    }
    
}

