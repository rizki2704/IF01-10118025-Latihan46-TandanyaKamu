/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan46.tandanyakamu;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private static final String RED = "\u001B[31m";
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    Age() {

    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        yearNow = 2019;
        return yearNow;
    }
    public int hitungUmur() {
        int umur = yearNow - yearBirth;
        return umur;
    }

    public String tandanyaKamu(int umur) {
        String meaning;
        switch (umur) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                meaning = "LAGI LUCU-LUCUNYA";
                break;

            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                meaning = "MASIH ANAK-ANAK";
                break;

            case 11:
            case 12:
            case 13:
                meaning = "MASIH REMADJA";
                break;

            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                meaning = "ALAY";
                break;

            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                meaning = "LAGI GALAU NYARI JODOH";
                break;

            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                meaning = "LAGI SIBUK NYARI UANG";
                break;

            default:
                meaning = "TIDAK TERDETEKSI KEHIDUPAN";

                if ((umur > 35) && (umur <= 150)) {
                    meaning = "SUDAH TUA";
                }

        }
        return RED + meaning;

    }
}
