/**
 * This App class contains the main executable method
 *
 * @author Justin Law
 * @version 1.0
 * class: EN.605.201.82.SU22
 */

public class App {

   /**
    * Executes the test code to instantiate 2 Animals and 2 Vehicles in an array,
    * along with their innate attributes and methods, before calling their
    * implemented interface methods polymorphically
    *
    * @param args
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {
      Object[] objects = {new Animal("dog"), new Animal("cat"), new Vehicle("honda", 8), new Vehicle("toyota", 2)};

      for (Object object : objects) {
         object.drawObject();
         object.resizeObject();
         object.rotateObject();
         object.playSounds();
      }
   } // end main

} // end App class
