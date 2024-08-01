package UKL;

import java.util.Scanner;

public class progdas {
    public static void main(String[] args) {
         /*Scanner sebagai inputannya
     * String loop sebagai looping do while
     * int no sebagai pemilih tugasnya.
     */
    Scanner gg = new Scanner(System.in);
    String loop;
    System.out.print("Masukkan Tugas ke-");
    int no = gg.nextInt();
    switch (no) {
        case 1:   
        /*Seorang Pendidik akan melakukan rekapitulasi nilai ujian Produktif RPL dari sejumlah siswa. 
        Buatlah sebuah program dalam bahasa Java untuk membantu guru tersebut 
        memasukkan nilai-nilai ujian dan kemudian mencetak nilai rata-rata dari seluruh nilai
        tersebut. Jumlah siswa dimasukkan dalam bentuk inputan.*/  

      do {
        System.out.println("=================SOAL 1================");
       //Guru Memasukkan Jumlah Siswa yang diinginkan terlebih dahulu.
       System.out.print("Masukkan Jumlah Siswa: ");
       int jmlh = gg.nextInt();
       double totalNilai = 0.0;
       //Variabel totalNilai diberikan 0.0 supaya bisa dihitung langsung, karena tanpa value, ya tidak ada valuenya :P
       System.out.println("=====================================");
       /*double nilai lalu dipakai di foreach untuk value dari setiap index siswa
        * Lalu nilai dari setiap siswa tersebut ditambah seluruhnya pada totalNilai += nilai.
       */
       for (int i = 1; i <=jmlh; i++) {
           System.out.print("Nilai Ujian siswa ke-"+i+": ");
           double nilai = gg.nextDouble();
           totalNilai += nilai;
           System.out.println("===========================================");
       }
       //Variabel totalNilai akan dibagikan dengan jumlah siswa lalu di outputkan dengan system printin.
       double ratarata = totalNilai/jmlh;
       System.out.println("Nilai rata-rata seluruh siswa adalah: "+ratarata);
       //Inilah gunannya String loop tersebut, untuk mengulangi do while sesuai kemauan pengguna/Guru.
       System.out.print("Ulangi? Y/N : ");
       loop = gg.next();
      } while (loop.equalsIgnoreCase("y"));  
      System.out.println("Bye bye! ^_^");
            break;

        case 2: 
        /*Buatlah sebuah program dalam bahasa Java untuk melakukan penjumlahan dua buah
        matriks. Matriks tersebut akan dimasukkan oleh pengguna dan hasil penjumlahannya
        akan ditampilkan. */
       System.out.println("==================================================");
       System.out.println("\t matriks! ");
       
       do {
        //Pertama, Pengguna akan memasukan baris & kolom yang diinginkan.
         System.out.print("Masukkan baris yang diinginkan : ");
         int baris = gg.nextInt();
         System.out.print("Masukkan kolom yang diinginkan : ");
         int kolom = gg.nextInt();
         //Value dari baris dan kolom akan dimassukan pada matriks A & B dibawah.
         int[][] A = new int[baris][kolom];
         int[][] B = new int[baris][kolom];
         //int hasil ini adalah untuk menyimpan jumlah dari A+B
         int[][] hasil = new int[baris][kolom];

         System.out.println("===================================");
         //Lalu pengguna akan memasukkan nilai dalam matriks A dan B
        System.out.print("Masukkan Nilai matriks A : ");
        for (int i = 0; i <baris; i++) {
            for (int j = 0; j <kolom; j++) {
                A[i][j] = gg.nextInt();
            }
        }
        System.out.println("======================================");

        System.out.print("Masukkan Nilai matriks B : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                B[i][j] = gg.nextInt();
            }
        }
        
        //Lalu ini adalah list dari inputan matriks yang dimasukkan oleh pengguna.
        System.out.println("===========================================");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println(" A "+A[i][j]+" + "+" B "+B[i][j]);
            }
        }
        System.out.println("==========================================");
        //Nah setelah selesai, waktunya membuat rumus penjumlahan dua matriks tersebut.
        System.out.println("/t PENJUMLAHAN");
        //Ini adalah foreach penambahan dari matriksnya.
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j <kolom; j++) {
                hasil[i][j] = A[i][j] + B[i][j];
            }
        }
        //Ini adalah output Hasil penjumlahan tersebut.
        System.out.println("===================HASIL===================");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("["+hasil[i][j]);
            }
            System.out.println("]");
        }
        //Pengulangan do while
        System.out.print("Ulangi? Y/N : ");
        loop = gg.next();
       } while (loop.equalsIgnoreCase("y"));
       System.out.println("Bye bye! ^_^");
        break;
    }
    }
}
