/*
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Service;

import Entidades.Matematica;


public class MatematicaService {   
    
    public long devolverMayor(Matematica obj)
    {
        return Math.max(obj.getNum1(), obj.getNum2());             
    }
    public long devolverMenor(Matematica obj)
    {
        return Math.min(obj.getNum1(), obj.getNum2());             
    }
    
    
    public int calcularPotencia(Matematica obj)
    {  
        return (int) Math.pow(Math.round(devolverMayor(obj)), Math.round(devolverMenor(obj)));
    }
    
     public long calcularRaiz(Matematica obj)
    {
              return (long) Math.sqrt(Math.abs(devolverMenor(obj)));
    }
    
    
}
