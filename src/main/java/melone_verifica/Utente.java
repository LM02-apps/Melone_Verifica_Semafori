/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melone_verifica;

/**
 *Thread utente, contiene il sesso dell'utente e indirizza a quale risorsa andare
 * @author Melone
 */
public class Utente extends Thread
{
    public String sesso;
    public boolean finethread=false;
    Semaforo bagno1;
    
    public Utente(String sesso, Semaforo s1) //costruttore utente con parametri sesso e semaforo bagno1
    {
        this.sesso = sesso;
        bagno1=s1;
    }
    
    public void run()
    {
        
        while(finethread==false)
        {
            
            if (finethread==false)
            {
                finethread=true;
                //controllo se l'utente è maschio o femmina
                if (sesso=="Maschio") 
                {
                    bagno1.EntrataBagnoUomini();
                    
                }
                else if (sesso=="Femmina")
                {
                    bagno2.EntrataBagnoDonne();
                }
            }
            else if (finethread==true)
            {
                finethread=false;
                
            }
            
        }
    
    }
}
