package de.gbsschulen.autos;

import java.util.Objects;

public class Auto {
    private String kennzeichen;
    private int ps;

    public Auto() {
    }

    public Auto(String kennzeichen, int ps) {
        this.kennzeichen = kennzeichen;
        this.ps = ps;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return ps == auto.ps &&
                Objects.equals(kennzeichen, auto.kennzeichen);
    }

    @Override
    public int hashCode() {

        return Objects.hash(kennzeichen, ps);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "kennzeichen='" + kennzeichen + '\'' +
                ", ps=" + ps +
                '}';
    }
}
