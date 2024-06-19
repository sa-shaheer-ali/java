package abstraction;

public abstract class GeometricObject {
    private String color="black";
    private boolean filled ;
    private java.util.Date dateCreated;

    GeometricObject(){
        dateCreated =new java.util.Date();
    }
   GeometricObject(String col,boolean fill){
    this.color=col;
    this.filled=fill;
    dateCreated=new  java.util.Date();

   }

   public String getcolor(){
   return color;
   }

   public boolean getfilled(){
    return true;
   } 

   public void  setColor (String col){
    color=col;
   }

   public void setfill(boolean fill){
    filled=fill;
   }
   public java.util.Date getDate(){
    return dateCreated;
   }
   public String toString(){
    return "create on " + dateCreated + "\ncolor"+ color + "and filled " + filled;
   }
public abstract  double getArea();
public abstract double getParameter();



    
}

