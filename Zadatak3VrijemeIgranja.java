/*
 * ZADATAK 3 – Koliko sam vremena proveo igrajući?
 * Programiranje u Javi – Auditorne vježbe, Sedmica 2
 *
 * Igrica je zabilježila ukupno vrijeme igranja u SEKUNDAMA.
 * Pretvorite ga u dane, sate, minute i sekunde koristeći operatore  /  i  %.
 *
 *   ukupnoSekundi = 200000   ->   2 d, 7 h, 33 min, 20 s
 *
 * Pomoć:  1 dan = 86 400 s     1 sat = 3 600 s     1 minuta = 60 s
 *         dani    = ukupnoSekundi / 86400;     (koliko CIJELIH dana stane)
 *         ostatak = ukupnoSekundi % 86400;     (sekunde koje su ostale)
 *         ... dalje na isti način za sate i minute
 *
 * Dodatno: napravite boolean varijablu viseOdJednogDana i ispišite je.
 * Provjera: probajte i sa 3661  ->  0 d, 1 h, 1 min, 1 s
 */
public class Zadatak3VrijemeIgranja {

    public static void main(String[] args) {
        int ukupnoSekundi = 3661;

        // TODO: izračunajte dane, sate, minute i sekunde (zamijenite nule izrazima)
        boolean viseOdJednogDana = false;
        int ostatak;
        int dani = ukupnoSekundi / 86400;
        ostatak = ukupnoSekundi % 86400;
        int sati = ostatak / 3600;
        ostatak = ostatak % 3600;
        int minute = ostatak / 60;
        ostatak = ostatak % 60;
        int sekunde = ostatak;

        System.out.println(ukupnoSekundi + " s = " + dani + " d, " + sati + " h, "
                + minute + " min, " + sekunde + " s");

        // TODO (dodatno): boolean viseOdJednogDana = ...
        // If check je bolje staviti odma kada izracunamo dan, ali sam ga stavio ovde zbog TODO-a
        if(dani > 1){
            viseOdJednogDana = true;
        }
        System.out.println("Vise od jednog dana? : " +viseOdJednogDana);
    }
}
