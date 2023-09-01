
package javaapplication8;

import Entidades.Matematica;
import Service.MatematicaService;

public class JavaApplication8 {

   
    public static void main(String[] args) {
       Matematica obj = new Matematica();
       MatematicaService serv= new MatematicaService();
       
       obj.setNum1();
       obj.setNum2();
        System.out.println("Numeros:: " +obj.getNum1()+obj.getNum2());
        System.out.println("Potencia:: "+serv.calcularPotencia(obj));       
        System.out.println("Raiz:: "+serv.calcularRaiz(obj)); 
        System.out.println("Mayor:: "+serv.devolverMayor(obj)); 
       
           
       
    }
    
}
