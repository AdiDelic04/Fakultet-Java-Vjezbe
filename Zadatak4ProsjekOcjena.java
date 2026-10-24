/*
 * ZADATAK 4 – Prosjek ocjena
 * Programiranje u Javi – Auditorne vježbe, Sedmica 2
 *
 * Student ima pet ocjena: 9, 8, 10, 7 i 9.
 *   a) izračunajte zbir ocjena (int)
 *   b) izračunajte prosjek kao int              -> šta dobijete? zašto?
 *   c) izračunajte prosjek kao double           -> mora biti 8.6 (a ne 8.0!)
 *   d) zaokružite prosjek na cijeli broj        -> Math.round(...)   -> 9
 *      (pažnja: Math.round vraća long -> spremite ga u long varijablu)
 *   e) ispišite prosjek sa dvije decimale        -> printf("Prosjek: %.2f%n", prosjek)
 *      (na računaru sa bosanskim regionalnim postavkama ispisuje se 8,60 - to je normalno)
 *   f) boolean imaStipendiju = prosjek je bar 8.5
 *
 * Očekivani ispis:
 *   Zbir: 43
 *   Prosjek (int): 8
 *   Prosjek (double): 8.6
 *   Zaokruženo: 9
 *   Prosjek: 8.60
 *   Stipendija: true
 */
public class Zadatak4ProsjekOcjena {

    public static void main(String[] args) {
        int o1 = 9, o2 = 8, o3 = 10, o4 = 7, o5 = 9;
        // TODO a) zbir
        int sumaOcjena = o1+o2+o3+o4+o5;
        System.out.println("Zbir ocjena : " +sumaOcjena);
        // TODO b) prosjek kao int
        int prosjekint = sumaOcjena / 5;
        System.out.println("Prosjek kao int: " +prosjekint);
        // TODO c) prosjek kao double (pazite na cjelobrojno dijeljenje!)
        double prosjekdouble = sumaOcjena / 5.00;
        System.out.println("Prosjek kao double: " +prosjekdouble);
        // TODO d) zaokruženi prosjek
        long prosjekzaokruzen = Math.round(prosjekdouble);
        System.out.println("Prosjek zaokruzen: " +prosjekzaokruzen);
        // TODO e) ispis sa dvije decimale (printf)
        System.out.printf("Prosjek zaokruzen: %.2f%n", prosjekdouble);
        // TODO f) stipendija
        boolean stipendija = false;
        if(prosjekdouble >= 8.5){
            stipendija = true;
        }
        System.out.println("Pravo na stipendiju: " +stipendija);
    }
}
