import java.util.Scanner;
public class siakad {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        double nilai,terendah=0,tertinggi=100;

        for(int i=1;i<=10;i++){
            System.out.println("Masukan Nilai Mahasiswa: "+i+": ");
            nilai =s.nextDouble();
            if (nilai>tertinggi) {
                tertinggi= nilai;
            }
            if (nilai<terendah) {
                terendah=nilai;
            }   
        }
        System.out.println("Nilai Tertinggi: "+tertinggi);
        System.out.println("Nilai Terendah: "+terendah);

        

        
    }
    
}
