
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado=new Scanner(System.in);
         int edad;
         System.out.println("Digite la edad");
         edad=teclado.nextInt();
         System.out.println(aptoEdad(edad));
    }
    
    public static double areac(double radio){
        final double PI=3.1416;
        return (Math.pow(radio, 2)*PI);        
    }
    
    public static double descuentoCompra(double desc,double compra){
         return compra*(desc/100);
    }
    public  static void cargarCompra(){
        double compra=100000;
        double desc=descuentoCompra(10, compra);
        System.out.println("compra "+compra);
        System.out.println("Descuento "+desc);
    }
    
    public int suma(int n1,int n2){
        return n1+n2;
    }
    
    public static char caracter(char ascii){
        return ascii;
    }
    
    public static String aptoEdad(int edad){
         String mensaje="";
         if(edad>0){
            if(edad>=18){
               mensaje="Es mayor";
            }          
            else{
                mensaje="Es menor";
            }//else if(edad>=18)
         }
         else{
            mensaje="la edad es negativa";
         }// else if(
         
         return mensaje;
    }
    
   
    
    
    
    
}
