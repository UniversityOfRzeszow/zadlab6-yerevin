package pl.edu.ur.oopl6.zad2;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class ObjectCounter {

    public static void main(String[] args) {
        Punkt[] p = new Punkt[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            // program tworzy nowy obiekt Punkt i przypisuje mu randmowoe wartosci dla wspolrzednych x, y, z i przypisuje go do miejsca w tablicy
            p[i] = new Punkt(r.nextInt(1000), r.nextInt(1000), r.nextInt(1000));
            // przy towrzeniu obiektu Punkt counter zwieksza sie bedac "obok" obiektu punktu, przez co znamy ilosc stworzonych punktow oraz jego numer
            System.out.println(p[i].toString());
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(Punkt.last_point.toString());
        System.out.println("-------------------------------------------------");
        Punkt.PokazOstatniObiekt();
    }
}
