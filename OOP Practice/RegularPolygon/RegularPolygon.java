package RegularPolygon;

public class RegularPolygon {
    // Data Fields
    private int n = 3; // no of sides
    private double r = 1.0; // side length
    private double x = 0 ;//x-coordinates
    private double y = 0 ;// y-coordinates

    // Constructors
    public RegularPolygon(){
        
    }
    public RegularPolygon( int noOfSides, double sideLength){
        this.n = noOfSides;
        this.r = sideLength;
    }
    public RegularPolygon( int noOfSides, double sideLength, double xCoordinate, double yCoordinate){
        this.n = noOfSides;
        this.r = sideLength;
        this.x = xCoordinate;
        this.y = yCoordinate;
    }

    // Getters 
    public int getN(){
        return n;
    }
    public double getR(){
        return r;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    // Setters
    public void setN(int noOfSides){
        this.n = noOfSides;
    }
    public void setR(double sideLength){
        this.r = sideLength;
    }
    public void setX(double xCoordinate){
        this.x = xCoordinate;
    }
    public void setY(double yCoordinate){
        this.y = yCoordinate;
    }

    // Get Perimeter
    public double getPerimeter(){
        return (this.n * this.r);
    }

    // getArea
    public double getArea(){
        return (n * Math.pow(r, 2)) / (4 * Math.tan(Math.PI/n));
    }

}



/*
 * (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides
have the same length and all angles have the same degree (i.e., the polygon is
both equilateral and equiangular). Design a class named RegularPolygon that
contains:
■ A private int data field named n that defines the number of sides in the poly-
gon with default value 3.
■ A private double data field named side that stores the length of the side with
default value 1.
■ A private double data field named x that defines the x-coordinate of the poly-
gon’s center with default value 0.
■ A private double data field named y that defines the y-coordinate of the poly-
gon’s center with default value 0.
■ A no-arg constructor that creates a regular polygon with default values.
■ A constructor that creates a regular polygon with the specified number of sides
and length of side, centered at (0, 0).
■ A constructor that creates a regular polygon with the specified number of sides,
length of side, and x- and y-coordinates.
■ The accessor and mutator methods for all data fields.
■ The method getPerimeter() that returns the perimeter of the polygon.
■ The method getArea() that returns the area of the polygon. The formula for
computing the area of a regular polygon is Area =
n * s2
p
4 * tan¢ ≤
 * 
 */
