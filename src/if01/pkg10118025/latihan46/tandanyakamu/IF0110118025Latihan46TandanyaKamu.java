/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age age = new Age();
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan tahun lahir anda : ");
        age.setYearBirth(scan.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.printf("Tahun Lahir Anda \t: %d%n", age.getYearBirth());
        System.out.printf("Hari ini tahun \t\t: %d%n", age.getYearNow());
        System.out.printf("Umur kamu sampai hari ini adalah %d tahun%n", age.hitungUmur());
        System.out.printf("Tandanya Kamu %s%n", age.tandanyaKamu(age.hitungUmur()));
    }
    
    
}
