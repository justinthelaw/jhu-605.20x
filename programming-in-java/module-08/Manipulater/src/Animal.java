/**
 * This Animal class extends Objects and implements all interfaces
 *
 * @author Justin Law
 * @version 1.0 class: EN.605.201.82.SU22
 */

public class Animal extends Object implements Drawable, Resizable, Rotatable, Sounds {
   public String name;

   // constructor
   Animal(String name) {
      setName(name);
   }

   // implements Drawable
   public void drawObject() {
      System.out.println("Drawing Animal, name: " + getName());
   } // end drawObject

   // implements Resizable
   public void resizeObject() {
      System.out.println("Resizing Animal, name: " + getName());
   } // end resizeOBject

   // implements Rotatable
   public void rotateObject() {
      System.out.println("Rotating Animal, name: " + getName());
   } // end rotateObject

   // implements Sounds
   public void playSounds() {
      System.out.println("Animal sound, name: " + getName());
   } // end playSounds

} // end Animal class
