/**
 * This Object class contains the common methods and attributes for "name"
 *
 * @author Justin Law
 * @version 1.0
 * class: EN.605.201.82.SU22
 */

public class Object {

   public String name;

   /**
    * sets name attribute
    *
    * @param name
    */
   public void setName(String name) {
      this.name = name;
   } // end setName

   /**
    * gets name attribute
    *
    * @return String
    */
   public String getName() {
      return this.name.length() > 0 ? this.name : "No Name";
   } // end getName

} // end Object class
