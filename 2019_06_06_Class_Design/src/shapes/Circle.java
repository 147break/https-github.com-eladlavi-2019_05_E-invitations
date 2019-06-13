package shapes;

public class Circle {
    private int x, y, radius;


    public Circle(){
        this(20, 20);
    }

    public Circle(int x, int y){
        this(x, y, 10);

    }

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = 1;
        setRadius(radius);
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }


    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }


    /**
     * sets the radius of the circle
     * @param radius the radius of the circle in meters, non negative value
     */
    public void setRadius(int radius){
        if(radius < 0)
            return;
        this.radius = radius;
    }



    public int getRadius(){
        return radius;
    }


    /**
     * calculates the area of the circle
     * @return the area of the circle
     */
    public double area(){
        return Math.PI * radius * radius;
    }


    public void fillColor(int red, int green, int blue){

    }


    public void fillColor(float hue, float saturation, float brightness){

    }

    public static void myFunc(){

    }


    @Override
    public String toString() {
        return "center: (" + x + "," + y + ") and radius: " + radius;
    }
}
