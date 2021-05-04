/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melone_verifica;

/**
 *Il main del programma.
 *Inizializza gli oggetti Utente di tipo thread e i Semafori per ogni bagno.
 * 
 * @author Melone
 */
public class Main 
{
    Semaforo bagno1=new Semaforo(1); //semaforo per bagno uomini
    Semaforo bagno2=new Semaforo(1); //semaforo per bagno donne
    
    public static void main(String[] args)
    {
        Utente unoM=new Utente("Maschio",bagno1);
        Utente dueF=new Utente("Femmina",bagno2);
        
        
        
        unoM.start();
        dueF.start();
        //unoM-->BagnoUomini
    }
    
}
