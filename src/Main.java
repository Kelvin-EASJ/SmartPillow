public class Main {
    public static void main(String[] args) {
        System.out.println("Smarthome dummy 1");

        MikroOvn sunesOvn = new MikroOvn(); //instantierer et objekt af klassen MikroOvn
        sunesOvn.drejeHastighed = -100;
        sunesOvn.temperatur = 700;
        sunesOvn.ydelse = 500;

        MikroOvn tommysOvn = new MikroOvn();
        tommysOvn.drejeHastighed = -100;
        tommysOvn.temperatur = 700;
        tommysOvn.ydelse = 500;

        MikroOvn benjamisOvn = new MikroOvn();

        System.out.println("Sunes ovn kører med" + sunesOvn.drejeHastighed);
        System.out.println("Tommies ovn kører med" +tommysOvn.drejeHastighed);
    }
}
