public class MikroOvn {
    //Objektets Egenskaber dvs. klassevariabler
    double temperatur; //celsius
    int timer; //ms
    String funktion; //optøgning, varming
    boolean drejeTaellerken; //true - det drejer, false - det drejer ikke
    byte drejeHastighed; //dreje hastighed mellem 1 og 100
    short ydelse;  //
    //gør-ting, dvs. metoder
    boolean start() {
        //TODO tænd kontakten der starter mirkoovnen.
        return true;
    }

    void stop() {
        //TODO sluk kontakten der starter mikroovnen
    }
}
 // if(Condition) { // det der skal gøres }
    // else { // det der ellers skal gøres }