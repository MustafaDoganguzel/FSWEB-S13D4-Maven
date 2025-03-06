package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x ;
        this.y = y;
    }

    public int getX (){
        return this.x;
    }
    public int getY (){
        return this.y;
    }
    public void setX (int x){
        this.x = x;
    }
    public void setY (int y){
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(x*x + y*y);
    }
    public double distance(Point p){

        int deneme = p.getX() - this.x;
        int deneme2 = p.getY() - this.y;

        return Math.sqrt(deneme*deneme + deneme2*deneme2);

    }
    public double distance(int a, int b){
        int deneme3 = a - this.x;
        int deneme4 = b- this.y;
        return Math.sqrt(deneme3*deneme3 + deneme4*deneme4);


    }

}
