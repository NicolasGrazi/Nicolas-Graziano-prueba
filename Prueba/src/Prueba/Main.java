package Prueba;


public class Main {

    public static void main(String[] args) {
       Ortoedro ortoedro= new Ortoedro(0.0,4,9);
       Cubo cubo=new Cubo(4);
       TetraedroRegular tetraedroRegular=new TetraedroRegular(9);

       tetraedroRegular.calcularSuperficie();
       tetraedroRegular.calcularVolumen();
       tetraedroRegular.toString();


       cubo.calcularVolumen();
       cubo.calcularSuperficie();
       cubo.toString();


       ortoedro.calcularSuperficie();
       ortoedro.calcularVolumen();
       cubo.toString();



    }
}
