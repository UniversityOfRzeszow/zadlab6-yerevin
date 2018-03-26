# OOPL6
Składowe statyczne klasy

## Zadanie 0 - Krótkie wprowadzenie
Składowe klasy mogą być statyczne i niestatyczne. Niestatyczne zawsze wiążą się z istnieniem jakiegoś obiektu (pola - odpowiadają elementom obiektu, metody muszą być wywoływane na rzecz obiektu, są komunikatami do obiektu).
Składowe statyczne (pola i metody) są wspólne dla wszystkich obiektów i:
* są deklarowane przy użyciu specyfikatora static,
* mogą być używane nawet wtedy, gdy nie istnieje żaden obiekt klasy

**Uwaga:** ze statycznych metod nie wolno odwoływać się do niestatycznych składowych klasy (obiekt może nie istnieć). Możliwe są natomiast odwołania do innych statycznych składowych.
Spoza klasy do jej statycznych składowych możemy odwoływać się na dwa sposoby:
* `NazwaKlasy.NazwaSkładowej`
* gdy istnieje jakiś obiekt: tak samo jak do niestatycznych składowych (uwaga: jest to
mylące i nie polecane).

## Zadanie 1
Utwórz klasę Figury. Umieść w niej poniższy kod i przetestuj działania. Zauważ, że metody statyczne `PoleKol`a i `ObwodKola` korzystają z innych metod statycznych zawartych w bibliotece `Math`, która również jest klasą. Dodaj wewnątrz klasy kolejne metody statyczne umożliwiające obliczanie następujących figur: `kwadrat`, `prostokąt`, `stożek`, `walec`. 

```java
package pl.edu.ur.oopl6.zad1;

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
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }
    
}
```

```java
package pl.edu.ur.oopl6.zad1;

public class SkladoweStatyczne {

    public static void main(String[] args) {
        // TODO zad 3
        
        System.out.println(Figury.PoleKola(0.5));
        System.out.println(Figury.ObwodKola(0.5));
    }
    
}
```

## Zadanie 2
Przetestuj i opisz działanie poniższego kodu źródłowego.

```java
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
```

```java
package pl.edu.ur.oopl6.zad2;

public class ObjectCounter {
    public static void main(String[] args){
        Punkt[] p = new Punkt[10];
        Random r = new Random();
        for (int i = 0; i<10; i++){
            p[i] = new Punkt(r.nextInt(1000), r.nextInt(1000), r.nextInt(1000));
            System.out.println(p[i].toString());
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(Punkt.last_point.toString());
        System.out.println("-------------------------------------------------");
        Punkt.PokazOstatniObiekt();
    }
}
```

## Zadanie 3
Utwórz klasę `Complex` implementującą strukturę liczb zespolonych. 
Do klasy dodaj metody statyczne dokonujące obliczeń na tych liczbach tj:
* obliczanie modułu liczby zespolonej
* obliczenie wartości liczby sprzężonej do liczby zespolonej
* zamiana postaci algebraicznej liczby zespolonej na wykładniczą
* zamiana postaci wykładniczej liczby zespolonej na algebraiczną
* dodawanie (z argumentami w postaci algebraicznej)
* dodawanie (z argumentami w postaci wykładnicze)
* odejmowanie (z argumentami w postaci algebraicznej)
* mnożenie (z argumentami w postaci algebraicznej)
* dzielenie (z argumentami w postaci algebraicznej)
* dzielenie (z argumentami w postaci wykładniczej)

Oraz metody zwracającą wartość liczby zespolonej w typie łańcuchowym (`String`) w postaci zapisu:
* algebraicznego
* wykładniczego
* trygonometrycznego

##### Opracował dr inż. Wojciech Kozioł
