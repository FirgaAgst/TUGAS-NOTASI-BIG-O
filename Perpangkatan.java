/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpangkatan;

/**
 *
 * @author firga
 */
import java.util.Scanner;

public class Perpangkatan {
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner (System.in);
        System.out.println("masukan angka: ");
        int bilangan = scanner.nextInt();
        
        if (bilangan > 0){
            int hasil = 1;
            for(int i = 0 ; i < 2 ; i++){
                    hasil *= bilangan;
                    
        }
        System.out.println("hasil pangkat dari bilangan " + bilangan + " adalah " + hasil);   
    } else{
        System.out.println("Bilangan harus lebih dari 0");
        }        
        scanner.close();
        }
}


/*
Analisis Kompleksitas Algoritma

1. Kompleksitas Waktu (Time Complexity):

-Algoritma ini memiliki kompleksitas waktu O(n) di mana n adalah eksponen dari pangkat.

-Dalam kasus ini, karena kita hanya menghitung pangkat 2 (dua kali iterasi), kompleksitas waktu akan menjadi O(2), yang merupakan O(1) atau waktu konstan.

-Iterasi dilakukan dua kali, sehingga skalanya tetap meski bilangan yang dimasukkan semakin besar.

2.Kompleksitas Ruang (Space Complexity):

-Kompleksitas ruang adalah O(1) karena kita hanya menggunakan sejumlah variabel tetap seperti bilangan, hasil, dan iterator i. Tidak ada penggunaan struktur data tambahan seperti array atau list.  


Simulasi Perhitungan Data
Mari kita lakukan simulasi untuk menghitung bilangan pangkat 2. Misalnya, kita menghitung pangkat 2 dari bilangan 5:

Input: 5
Iterasi pertama (i = 0):
Hasil awal adalah 1.
hasil = hasil * bilangan → hasil = 1 * 5 = 5
Iterasi kedua (i = 1):
hasil = hasil * bilangan → hasil = 5 * 5 = 25
Output: Hasil pangkat 2 dari 5 adalah: 25

Simulasi perhitungan ini berlaku sama untuk bilangan lainnya, dengan perulangan sebanyak 2 kali karena eksponen pangkat adalah 2.


*/
