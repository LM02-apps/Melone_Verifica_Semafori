/*
 * 
    To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melone_verifica;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Classe semaforo per la gestione dei thread
 * @author Melone
 */
public class Semaforo 
{
    int valore;

    public Semaforo(int valore) 
    {
        this.valore = valore;
    }
    synchronized public void P()
    {
        while(valore==0)
        {
            try
            {
                wait();
            }   
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        valore--;
    }
    synchronized public void V()
    {
        valore++;
        notify();
    }


}
