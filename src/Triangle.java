public class Triangle {

    private double base;
    private double height;
    private double sideA;
    private double sideB;

    public Triangle(double base, double height, double sideB, double sideA){
        this.base=base;
        this.height=height;
        this.sideB=sideB;
        this.sideA=sideA;
    }

    public double square(){
       return base*height/2;
    }

    public double circuit() {
        return sideA+sideB+base;
    }

    //Setery (muttatory)
  //  public void setBase(double base){
    //     this.base=base;
    //  }

    //public void setHeight(double height){
    //     this.height=height;
//    }
    //  public void setSideA(double sideA){
    //       this.sideA=sideA;
    //   }

    //  public void setSideB(double sideB) {
    //     this.sideB = sideB;
    //   }
}
