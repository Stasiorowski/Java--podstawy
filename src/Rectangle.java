public class Rectangle {


    private double sideA;
    private  double sideB;

    public  Rectangle(double sideA,double sideB){
        this.sideB=sideB;
        this.sideA=sideA;
    }


    public double circuit(){
        return 2*sideA+2*sideB;
    }
    public double square(){
        return sideB*sideA;
    }


    //Setery (muttatory)
   // public void setSideA(double sideA){
    //   this.sideA=sideA;
    //}
    //Setery (muttatory)
    // public void setSideB(double sideB){
    //  this.sideB=sideB;
    // }



}
