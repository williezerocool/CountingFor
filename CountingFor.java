/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingfor;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class CountingFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        //n is the loops counter, without it getting incermented the loop would never stop
        //int n=1, is initializing the loop
        for ( int n = 2 ; n <= 10 ; n = n+2 )
        {
            System.out.println( n + ". " + message );
        }
    }
    
}
