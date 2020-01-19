public class Kolo {
 private double radius;
public Kolo(double radius){
    this.radius=radius;
}

    public double square() {
        return radius*radius*Math.PI;
    }

    public double circuit() {
            return 2*radius*Math.PI;
        }
    //Setery (muttatory)
    //public void setRadius(double radius){
      //this.radius=radius;
   // }


    }
