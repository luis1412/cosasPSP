/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohilo;

/**
 *
 * @author lhercru721
 */

   
  class hiloMundo extends Thread {

      private int id = -1;
      
    public hiloMundo(int id) {
      this.id = id;  
    }

    public hiloMundo() {
    }
       
      
        @Override
        public void run() {
            if (id != -1) {
               System.out.println("Hola mundo desde hilo " + id);
            }
            else{
                System.out.println("Hola mundo");
            }
        }
  }
    
    
    public class EjemploHilo {
        public static void main(String[] args) throws InterruptedException{
            Thread[] arrayHilos = new Thread[5];
            Thread[] arrayHilos1 = new Thread[5];
            
            for (int i = 0; i < arrayHilos.length; i++) {
                arrayHilos1[i] = new Thread(new hiloMundo());
                arrayHilos[i] = new Thread(new hiloMundo(i));
                arrayHilos1[i].start();
                arrayHilos1[i].sleep(i);
                arrayHilos[i].start();
                arrayHilos[i].sleep(i);
                
                
           }

        }
}
