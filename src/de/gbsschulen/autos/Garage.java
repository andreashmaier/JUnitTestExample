package de.gbsschulen.autos;

public class Garage {
    private Auto[] autos;

    public Garage(int maxAnzahlAutos) {
        this.autos = new Auto[maxAnzahlAutos];
    }

    public boolean hinzufuegen(Auto auto, int pos) {
        if (checkPosition(pos)){
            autos[pos] = auto;
            return true;
        }
        return false;
    }

    public boolean checkPosition(int pos) {
        if (pos < 0 || pos >= autos.length) {
            return false;
        }
        return true;
    }

    public int anzahl() {
        int anzahl = 0;
        for (Auto auto : autos) {
            if (auto != null) {
                anzahl++;
            }
        }
        return anzahl;
    }

    public Auto entferneAuto(int pos) {
        if (!checkPosition(pos)){
            return null;
        }
        Auto entferntesAuto = autos[pos];
        autos[pos] = null;
        return entferntesAuto;
    }
}
