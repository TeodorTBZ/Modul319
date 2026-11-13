package kn01;

import java.util.Random;

public class Programm {

    public static void main(String[] args) {
        Random zufall = new Random();
        int spielcode = zufall.nextInt(10000); // Zahl von 0 bis 9999

        System.out.println("==========================================");
        System.out.println("        _____                             ");
        System.out.println("       /     \\        ___                 ");
        System.out.println("      | () () |      /   \\                ");
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
    }
}
