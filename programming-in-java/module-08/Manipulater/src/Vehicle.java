/**
 * This Vehicle class extends Objects and implements all interfaces
 *
 * @author Justin Law
 * @version 1.0 class: EN.605.201.82.SU22
 */

public class Vehicle extends Object implements Drawable, Resizable, Rotatable, Sounds {
   public String name;
   public int age = 0;

   // constructor
   Vehicle(String name, int age) {
      setName(name);
      setAge(age);
   }

   /**
    * sets age attribute
    *
    * @param age
    */
   public void setAge(int age) {
      this.age = age;
   } // end setAge

   /**
    * gets age attribute
    *
    * @return int
    */
   public int getAge() {
      return this.age;
   } // end getAge

   // implements Drawable
   public void drawObject() {
      System.out.println("Drawing Vehicle, name: " + getName() + ", age: " + age);
   } // end drawObject

   // implements Resizable
   public void resizeObject() {
      System.out.println("Resizing Vehicle, name: " + getName() + ", age: " + age);
   } // end resizeOBject

   // implements Rotatable
   public void rotateObject() {
      System.out.println("Rotating Vehicle, name: " + getName() + ", age: " + age);
   } // end rotateObject

   // implements Sounds
   public void playSounds() {
      System.out.println("Vehicle sound, name: " + getName() + ", age: " + age);
   } // end playSounds

} // end Animal class
