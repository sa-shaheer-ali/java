package abstraction;

public class Circle extends GeometricObject {
    int size ;
    Circle (int changesize){
        this.size=changesize;

    }
    
    public double getArea(){
        int r=size;
        double A=Math.PI* r *r;
        return A;
    }
    public double getParameter(){
        double r=size;
        double C=Math.PI * r*2;
        return C;
        

    }
    

    
}
