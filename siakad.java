import java.util.Scanner;
public class siakad {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        double nilai,tertinggi=0,terendah=100;
        int lulus=0,tidaklulus=0;
    

        for(int i=1;i<=10;i++){
            System.out.println("Masukan Nilai Mahasiswa: "+i+": ");
            nilai =s.nextDouble();
            if (nilai>tertinggi) {
                tertinggi= nilai;
            }
            if (nilai<terendah) {
                terendah=nilai;
            }   
            if (nilai>=60) {
                lulus++;
            }
            else{
                tidaklulus++;
            }
        }
        System.out.println("Nilai Tertinggi: "+tertinggi);
        System.out.println("Nilai Terendah: "+terendah);
        System.out.println("Jumlah Mahasiswa yang lulus: "+ lulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus: "+tidaklulus);
    }
    
}
