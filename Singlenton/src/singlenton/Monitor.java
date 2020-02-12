/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlenton;

/**
 *
 * @author anali
 */
public class Monitor {

    public static Monitor getMonitor() {
        return Monitor;
    }

    public static void setMonitor(Monitor aMonitor) {
        Monitor = aMonitor;
    }
    
    private  String nombre;
    private static Monitor Monitor;

    
    public static Monitor Monitor(String nombre){
        if(Monitor==null){
            Monitor = new Monitor(nombre);
        }
        return Monitor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    


}
