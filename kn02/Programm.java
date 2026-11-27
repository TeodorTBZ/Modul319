package kn02;
import java.util.Random;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Random zufall = new Random();
        int spielcode = zufall.nextInt(10000); // Zahl von 0 bis 9999

        System.out.println("==========================================");
        System.out.println("        _____                             ");
        System.out.println("       /     \\        ___                 ");
        System.out.println("      | () () |      |   \\                ");
        System.out.println("       \\  ^  /      | + |   ___          ");
        System.out.println("        |||||       |___|  /   \\         ");
        System.out.println("        |||||   ____|   |_|  _  |        ");
        System.out.println("   _____|||||__/    \\_____|_| |_|____    ");
        System.out.println("==========================================");
        System.out.println();
        System.out.println("            D A S   V E R L I E S         ");
        System.out.println();
        System.out.println("==========================================");
        System.out.println();
        System.out.println("Willkommen, mutige Seele...");
        System.out.println("Vor dir gähnt der Eingang zu einem uralten Verlies.");
        System.out.println("Kalte Luft weht dir entgegen, und aus der Tiefe");
        System.out.println("hörst du ein leises, dunkles Knurren.");
        System.out.println();
        System.out.println("Raum für Raum, Monster für Monster, Schatz für Schatz");
        System.out.println("wirst du hinabsteigen. Nicht alle kehren zurück.");
        System.out.println();
        System.out.println("Dein Spielcode: " + spielcode);
        System.out.println();
        System.out.println("Möge das Glück mit dir sein, Held:in!");
        System.out.println("==========================================");
        System.out.println();

        // Scanner für Konsoleneingaben initialisieren
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib den Namen deines Helden ein: ");
        String heldenname = scanner.nextLine();

        System.out.print("Gib dein Startkapital (Gold) ein: ");
        int gold = scanner.nextInt();

        final int MAX_LEVEL = 10;
        int lebenspunkte = 100;
        double staerke = 15.5;
        boolean lebendig = true;
        boolean trankDabei = true;

        // Berechnungen mit Kurzformen (+= und --)
        gold += 25;       // Bonus-Gold zum Start
        lebenspunkte--;   // Kleiner Abzug beim Betreten

        // Implizite Umwandlung von int nach double
        double aktuellesLevelDouble = MAX_LEVEL;

        // Kampfkraft berechnen (Stärke * Level)
        double kampfkraft = staerke * aktuellesLevelDouble;

        // Expliziter Cast von double nach int (Nachkommastellen werden abgeschnitten)
        int kampfkraftGanzzahl = (int) kampfkraft;

        // Gold auf 3 Spieler aufteilen (/ und %)
        int goldProSpieler = gold / 3;
        int goldRest = gold % 3;

        // Formatierter Statusblock
        System.out.println();
        System.out.println("==========================================");
        System.out.println("         S P I E L E R - S T A T U S      ");
        System.out.println("==========================================");
        System.out.println("Heldenname       : " + heldenname);
        System.out.println("Max-Level        : " + MAX_LEVEL);
        System.out.println("Lebenspunkte     : " + lebenspunkte);
        System.out.println("Gold (gesamt)    : " + gold);
        System.out.println("Staerke          : " + staerke);
        System.out.println("Kampfkraft (int) : " + kampfkraftGanzzahl);
        System.out.println("Gold / 3 Spieler : " + goldProSpieler + " pro Person (Rest: " + goldRest + ")");
        System.out.println("Lebendig         : " + lebendig);
        System.out.println("Trank dabei      : " + trankDabei);
        System.out.println("==========================================");

        // Gültigkeitsbereich (Scope) Beispiel mit einem zusätzlichen Block
        String lokalerHinweis;
        {
            lokalerHinweis = "Viel Erfolg im Verlies!";
            System.out.println(lokalerHinweis);
        }

        scanner.close();
    }
}


