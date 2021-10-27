package Prueba;

public class Ortoedro extends FiguraTridimensional {
    public double altura;
    public double base;
    public double ancho;

    public final static double caras=6;

 Ortoedro(Double altura, double base, double ancho){

     this.altura=altura;
     this.base=base;
     this.ancho=ancho;


 }
 Ortoedro(){
     altura=1;
     base=1;
     ancho=1;
 }

    public double calcularSuperficie() {
     double superficie;

     superficie=2* (ancho*base)+ 2*(ancho*altura)+2*(base*altura);

     return superficie;
    }


    public double calcularVolumen() {
        double volumen;
        volumen=altura*base*ancho;
        return volumen;
    }


    public String toString() {
        return "La figura es un Cubo";
    }
}
