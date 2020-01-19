import java.security.PublicKey;

public class Program {

    public static void main(String[] args) {

        oblczTrojkat();
        obliczKwadrat();
        obliczProstokat();
        obliczKolo();
    }
        private static void oblczTrojkat(){
        Triangle triangle = new Triangle(5,7,5,5);


            //triangle.setBase(5);
            //triangle.setHeight(7);
            //triangle.setSideA(5);
            //triangle.setSideB(5);


            double circuit = triangle.circuit();
            double square = triangle.square();

            System.out.println("__________________________________________________");
            System.out.println("Obwód trójkąta  wynosi " + circuit);
            System.out.println("Pole powierzchni trójkąta  wynosi " + square);
        }

    private static void obliczKwadrat(){
        Kwadrat kwadrat = new Kwadrat(5);

          //  kwadrat.setSide(5);

            double circuit = kwadrat.circuit();
            double square = kwadrat.square();

            System.out.println("__________________________________________________");
            System.out.println("Obwód kwadratu wynosi " + circuit);
            System.out.println("Pole powierzchni kwadratu wynosi " + square);
        }

        private static void obliczProstokat(){
        Rectangle rectangle = new Rectangle(5,10);

           // rectangle.setSideA(5);
            //rectangle.setSideB(10);

            double circuit = rectangle.circuit();
            double square = rectangle.square();

            System.out.println("__________________________________________________");
            System.out.println("Obwód prostokątu wynosi" + circuit);
            System.out.println("Pole powierzchni prostokątu wynosi" + square);

        }

        private static void obliczKolo(){
        Kolo kolo = new Kolo(10);

           // kolo.setRadius(10);
            double circuit=kolo.circuit();
            double square=kolo.square();

            System.out.println("__________________________________________________");
            System.out.println("Obwód koła wynosi " + circuit);
            System.out.println("Pole powierzchni koła wynosi " + square);
        }

    }

