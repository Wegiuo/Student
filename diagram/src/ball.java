public class ball {
    private double x =0.0;
    private double y =0.0;

    public ball(double x, double y){
        this.x=x;
        this.y=y;
    }
    public ball(){
        this.x=0.0;
        this.y=0.0;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x=x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x=x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        this.x = this.x + xDisp;
        this.y = this.y + yDisp;
    }
    
    public String toString(){
        return "x: " + x + "  y: " + y;
    }
}
