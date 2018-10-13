/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakcontinue;

/**
 *
 * @author Yova
 */
public class BreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("dentro del ciclo "+ i);
            if (i == 2) {
               // break;
                continue;
            }
            System.out.println("Valor de i:" +i);
        }
        System.out.println("Fuera del ciclo");
    }
    
}
