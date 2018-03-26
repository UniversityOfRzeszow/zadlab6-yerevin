package pl.edu.ur.oopl6.zad2;

public class Punkt {

    private int x;
    private int y;
    private int z;

    // Pole statyczne przechowujące w pamięci ilość obiektów klasy Punkt
    // Pole jest współdzielone dla wszystkich obiektów
    private static int counter;
    public static Punkt last_point;

    public Punkt(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        counter++;
        last_point = this;
    }

    public static void PokazOstatniObiekt() {
        System.out.println("Klasa Punkt o współrzędnych (x = " + last_point.x
                + " y = " + last_point.y + ""
                + " z = " + last_point.z + "). Istnieje już"
                + " " + last_point.counter + " obiekt tej klasy.");
    }
    
    @Override
    public String toString(){
        String s = "Klasa Punkt o współrzędnych (x = " + last_point.x
                + " y = " + last_point.y + ""
                + " z = " + last_point.z + "). Istnieje już"
                + " " + last_point.counter + " obiekt tej klasy.";
        return s;
    }

}
