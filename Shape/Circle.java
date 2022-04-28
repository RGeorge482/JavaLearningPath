package Shape;

/**
 * A simple Circle class
 * Radius property is an integer 
 * can calculate the area and the perimeter of a circle
 */

public class Circle {
    private int radius;

    /**
    * Create a SPECIFIC Circle given a radius
    * @param radius the radius given as an int
    */
    public Circle(int radius){
    this.radius = radius;   
    }
   
    // METHODS 

    /**
     * Determine the area of the circle
     * Reminder Area = PI * radius * radius
     * @return the area as an double
     */
    public double getArea(){
        return (Math.PI * (this.radius * this.radius));
    }

    /**
    * determine the perimeter length of the circle
    * reminder: Perimeter = PI * radius * 2
    * @return the perimeter as an double
    */
    public double getPerimeter(){
       return ( Math.PI * this.radius * 2);
    }
    
}
