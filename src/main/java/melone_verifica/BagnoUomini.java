/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melone_verifica;

/**
 *Risorsa bagnouomini, accessibile solo dai thread con stringa sesso a "Maschio"
 * @author Melone
 */
public class BagnoUomini 
{
    Semaforo bagnouomini;
    
    public void EntrataBagnoUomini() throws InterruptedException
    {
        
        bagnouomini.P();
        System.out.println("l'utente"+ Thread.currentThread()+ "e' entrato nel bagno");
        Thread.sleep(3000);
        System.out.println("L'utente "+ Thread.currentThread()+ " e' uscito dal bagno");
        bagnouomini.V();
    }
}
