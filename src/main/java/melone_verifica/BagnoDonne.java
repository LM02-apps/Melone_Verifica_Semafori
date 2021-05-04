/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melone_verifica;

/**
 *Risorsa bagnodonne, accessibile solo dai thread con stringa sesso a "Femmina"
 * @author Melone
 */
public class BagnoDonne 
{
    Semaforo bagnodonne;
    
    public void EntrataBagnoDonne() throws InterruptedException
    {
        
        bagnodonne.P(); //fa accedere alla risorsa
        System.out.println("l'utente"+ Thread.currentThread()+ "e' entrato nel bagno");
        Thread.sleep(3000);
        System.out.println("L'utente "+ Thread.currentThread()+ " e' uscito dal bagno");
        bagnodonne.V();//libera la risorsa
    }
}
