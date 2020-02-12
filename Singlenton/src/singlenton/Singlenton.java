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
public class Singlenton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido");
        Monitor monitor1 = new Monitor("hola");
        Monitor monitor2 = new Monitor("hola2");
        System.out.println(monitor1.hashCode());
        System.out.println(monitor2.hashCode());
    }
    
}
