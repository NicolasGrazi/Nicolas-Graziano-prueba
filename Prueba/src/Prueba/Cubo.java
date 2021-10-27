package Prueba;

public class Cubo extends FiguraTridimensional {


 public double lados;
 public final static double caras=6;

 Cubo(double lados){
     this.lados=lados;

 }
 Cubo(){

     lados=1;
 }

    public double calcularSuperficie() {
        double superficie;
        superficie=6*(lados*lados);
        return superficie;
    }


    public double calcularVolumen() {
        double volumen;
        volumen= lados * lados * lados;

        return volumen;
    }

    public String toString() {
        return "La figura es un Ortoedro ";
    }
}
