/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author cstuser
 */
public class Sandbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world in my Sandbox!!!!!");
        System.out.println("Complied");
        
        Integer a = new Integer(0);
        a = 0;
        int b = 2;
        boolean result = (a==b);
        
        System.out.println("Is a = b?"+result);
        System.out.println("The value of a is " + a);
        System.out.println("The value of a is " + b);
        
        if (a!=b){
            System.out.println("The value of a is EQUAL");
            
        }
        
    }
    
}
