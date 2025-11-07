import java.util.Scanner;
public class TiketBioskop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ht=50000;
        int jt,tt=0;
        double tp=0;

        do{
            System.out.println("Masukan Jumlah Tiket Yang Dibeli: ");
            jt=s.nextInt();
        
            if (jt < 0) {
                System.out.println("Jumlah Tiket Tidak Valid,Coba Isi ulang ");
                continue;
            }
            if (jt == 0) {
                break;
            }
            double th= tt*ht;

            if (jt > 10) {
                th *=0.85;
                System.out.println("Mendapatkan Diskon 15%");
            }
            else if (jt > 4) {
                th*=0.90;
                System.out.println("Mendapatkan Diskon 10%");
            }

            tt +=jt;
            tp +=th;
            System.out.println("Total Harga Tiket Untuk Pelanggan: Rp "+th);
            System.out.println();
        }while(true);

        System.out.println("=== NOTA ===");
        System.out.println("========================================");
        System.out.println("Total Tiket Yang Terjual Hari ini: "+tt);
        System.out.println("Total Pendapatan Hari Ini: Rp "+tp);
        System.out.println("========================================");
    }
}
