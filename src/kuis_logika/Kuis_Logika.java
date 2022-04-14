/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_logika;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Kuis_Logika {

    public static void main(String[] args) {
        Beda();

    }

    public static void Banding() {
        //Soal Nomer 1
        Scanner input = new Scanner(System.in);
        System.out.println("Soal Nomer 1");
        System.out.println("Perbandingan");
        int a;
        int b;
        System.out.println("Masukan Bilangan 1 : ");
        a = input.nextInt();
        System.out.println("Masukan Bilangan 2 : ");
        b = input.nextInt();

        if (a > b) {
            System.out.println("Bilangan yang lebih besar = " + a);

        } else if (a < b) {
            System.out.println("Bilangan Yang Lebih Besar = " + b);
        } else {
            System.out.println("Sama Besar");
        }
    }

    public static void GanjilGenap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Soal Nomer 2");
        System.out.println("Ganjil Genap");
        int a;
        int b;
        System.out.println("Masukan Bilangan 1 : ");
        a = input.nextInt();

        if (a % 2 == 1) {
            System.out.println("Ganjil");
        } else {
            System.out.println("Genap");
        }

    }

    public static void Jumlah() {
        System.out.println("Soal nomer 3");
        System.out.println("Jumlah Bilangan ke N");
        Scanner input = new Scanner(System.in);
        int N;
        int jum = 0;
        System.out.println("Masukan bilangan N : ");
        N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            jum += i;
            System.out.println("Jumlah Bilangan = " + jum);
        }

    }

    public static void GanjilGenap2() {
        System.out.println("Soal nomer 4");
        System.out.println("Ganjil Genap 2");

        int[] angka = {170, 113, 1, 7, 1};

        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
        
        for (int p = 0; p < angka.length; p++) {
           
            if (angka[p] % 2 == 0) {
                System.out.print(" Genap ");
            } else {
                System.out.print(" Ganjil ");
            }

        }

    }

    public static void maksimum() {
        System.out.println("Soal nomer 5");
        System.out.println("Nilai maksimum pada array");
        int maksimum, jumlah, i, lokasi = 1, array[];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        jumlah = scan.nextInt();
        array = new int[jumlah];

        System.out.println("Masukkan " + jumlah + " angka");
        for (i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }
        maksimum = array[0];
        for (i = 0; i < jumlah; i++) {
            if (array[i] > maksimum) {
                maksimum = array[i];
                lokasi = i + 1;
            }
        }
        System.out.println("Nilai makasimum adalah " + maksimum + " berada di elemen ke " + lokasi);

    }

    public static void mungkin() {
        System.out.println("Soal nomer 6");
        System.out.println("Mungkin");
        Scanner input = new Scanner(System.in);
        int k;
        int[] bil = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Masukan nilai k : ");
        k = input.nextInt();
        for (int i = 0; i < bil.length; i++) {
            for (int j = 0; j < bil.length; j++) {
                if (bil[i] + bil[j] == k) {
                    System.out.print("Bisa");
                } else {
                    System.out.print("Tidak Bisa");
                }
            }

        }
    }

    public static void Beda() {
        System.out.println("Soal nomer 7");
        System.out.println("Beda");
        //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }

    public static void Buah() {
        System.out.println("Soal nomer 8");
        System.out.println("Penjualan Buah");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Inputkan jumlah buah: ");
        int jumlahBuah = userInput.nextInt();
        userInput.nextLine();
        System.out.println();
        String[] namaBuah = new String[jumlahBuah];
        int[] banyakBuah = new int[jumlahBuah];
        masukkanNamaDanBanyakBuah(userInput, jumlahBuah, namaBuah, banyakBuah);

        int idxBuahTerbanyak = idxBuahTerbanyak(banyakBuah);
        System.out.println(
                (idxBuahTerbanyak >= 0)
                        ? "Terbanyak: " + banyakBuah[idxBuahTerbanyak] + " (" + namaBuah[idxBuahTerbanyak] + ")"
                        : "---"
        );
    }

    static void masukkanNamaDanBanyakBuah(Scanner userInput, int jumlahBuah, String[] namaBuah, int[] banyakBuah) {
        for (int i = 0; i < jumlahBuah; i++) {
            System.out.print("Masukkan nama buah " + (i + 1) + ": ");
            namaBuah[i] = userInput.nextLine();
            System.out.print("Masukkan banyak buah " + namaBuah[i] + ": ");
            banyakBuah[i] = userInput.nextInt();
            userInput.nextLine();
            System.out.println();
        }
    }

    static int idxBuahTerbanyak(int[] banyakBuah) {
        int i = banyakBuah.length;
        if (i == 0) {
            return -1; // -> jika jumlahBuah == 0.
        }
        int idxOfTerbanyak = 0;
        while (i-- > 1) {
            if (banyakBuah[i] > banyakBuah[idxOfTerbanyak]) {
                idxOfTerbanyak = i;
            }
        }
        return idxOfTerbanyak;
    }

}
