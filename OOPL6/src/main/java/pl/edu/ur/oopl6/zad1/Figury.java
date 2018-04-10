package pl.edu.ur.oopl6.zad1;

/**
 *
 * @author DELL
 */
public class Figury {

    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }

    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r) {
        return Math.round((Math.PI * Math.pow(r, 2)) * 1000) / 1000;
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r) {
        return Math.round((2 * Math.PI * r) * 1000) / 1000;
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double poleKwadrat(double r) {
        return Math.round(Math.pow(r, 2) * 1000) / 1000;
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double obwodKwadrat(double r) {
        return Math.round(4 * r * 1000) / 1000;
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double poleProstokat(double r, double b) {
        return Math.round(r * b * 1000) / 1000;
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double obwodProstokat(double r, double b) {
        return Math.round((2 * r + 2 * b) * 1000) / 1000;
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double poleStozka(double r, double l) {
        return Math.round((Math.PI * r * r + Math.PI * r * l) * 1000) / 1000;
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double poleWalec(double r, double H) {
        return Math.round((2 * Math.PI * r * r + 2 * Math.PI * r * H) * 1000) / 1000;
    }

}
