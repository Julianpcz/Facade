/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadejc;
import api.EnvioApi;
import api.ProductoApi;

public class CheckFacade {
    private ProductoApi productoapi;
    private EnvioApi envioapi;
    
    public CheckFacade(){
    
    productoapi = new ProductoApi();
    envioapi = new EnvioApi();
    }
    
    public void buscar(String Nombrepro,String Origen, String Destino,String FechaEnv,String FechaEnt, int Precio, String Proveedor ){
    productoapi.buscarProductos(Nombrepro, Proveedor, Precio);
    envioapi.buscarEnvios(FechaEnt, Origen, Destino, FechaEnv);
    
    } 
}
