public class Main {
    public static void main(String[] args) {

        MaquinaDeCafe cafe1 = new MaquinaDeCafe();
        cafe1.servirAmericano();
        System.out.println(cafe1);
        MaquinaDeCafe cafe2 = cafe1;
        cafe2.servirCapuchino();
        System.out.println(cafe2);
        MaquinaDeCafe cafe3 = cafe2;
        cafe3.servirExpreso();
        System.out.println(cafe3);
        cafe3.mostrarRecursos();
        System.out.println(cafe3);
    }
}