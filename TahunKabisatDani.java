import java.util.Scanner;

public class TahunKabisatDani{
    public static void main(String[] args) {
        int hari = 0; 
        int bulan;   
        int tahun; 

        System.out.print("Masukan Bulan Dengan Angka (1-12): ");   
        Scanner scanbulan = new Scanner(System.in);   
        bulan = scanbulan.nextInt(); 
        
        if(bulan < 1 || bulan > 12){
            System.out.println("Masukan Salah"); 
        }
        else {
            int isEven = bulan%2; 
            switch(isEven){
                case 0: 
                hari = 30; 
                break;

                case 1:
                hari = 31;
                break;
                
            }

            System.out.print("Masukan Tahun : "); 
            Scanner scantahun = new Scanner(System.in); 
            tahun = scantahun.nextInt(); 

            System.out.println(); 

            if(tahun%4 == 0 && tahun%100 != 0) {
                System.out.println(tahun + " ini adalah Tahun Kabisat."); 
                if(bulan == 2 && tahun%2 != 0) {
                    hari = 28; 
                }
                else if (bulan == 2 && tahun%2 == 0) {
                    hari =29;
                }
            }
            else {
                System.out.println(tahun + " Ini Bukan Tahun Kabisat."); 
                
            }
            System.out.println("Ada " + hari + " Hari di Bulan " + bulan + " di Tahun " + tahun + "."); 
        }

    }
} 

