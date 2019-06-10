package shapes;

public class Circle {
    private int x, y, radius;


    /*
    public Circle(){
        x = 20;
        y = 20;
        radius = 10;
    }
    */

    public Circle(int x, int y){
        this.x = x;
        this.y = y;
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


    public void setRadius(int radius){
        if(radius < 0)
            return;
        this.radius = radius;
    }



    public int getRadius(){
        return radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    void fillColor(){
    }

    public static void myFunc(){

    }

}
