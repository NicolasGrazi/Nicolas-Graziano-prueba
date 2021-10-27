package Prueba;

public class TetraedroRegular extends FiguraTridimensional {

    public double aristas;
    public final static double caras=4;


    TetraedroRegular(double aristas){

        this.aristas=aristas;


    }
    TetraedroRegular(){

        this.aristas=1;

    }



    public double calcularSuperficie() {
        double superficie;
        superficie=Math.sqrt(3)*(Math.pow(aristas, 2));;

        return superficie;
    }


    public double calcularVolumen() {
       double volumen;

        volumen= Math.sqrt(2)*(Math.pow(aristas, 3))/12;

        return volumen;
    }

    public String toString() {
        return "La figura es un TetraedroRegular ";
    }
}


