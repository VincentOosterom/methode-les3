public class C_Oppervlakte {

    public static void main(String[] args) {


        int antwoord = 0;

        int inhouddoos1 = Retangle(2, 8);
        int inhouddoos2 = four(5, 5, 5, 5);
        int inhouddoos3 = box(2, 8, 5);

        System.out.println("De oppervlakte van een rechthoek met lengte 2 en breedte 8  = " + inhouddoos1);
        System.out.println("De oppervlakte van een vierkant met zijden van 5 cm = " + inhouddoos2 + "cm");
        System.out.println("De oppervlakte van een doos met lengte 2, breedte 8 en hoogte 5 = " + inhouddoos3 + "m3");

    }

    public static int Retangle(int a, int b) {
        return a * b;
    }

    public static int four(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static int box(int lengte, int breedte, int hoogte) {
        return lengte * breedte * hoogte;
    }




}
