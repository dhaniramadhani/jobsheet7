import java.util.Scanner;
public class kafedowhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int kopi,teh,roti,th;
        String np;
        int hargaK=12000,hargaT=7000,hargaR=20000;


        do{
            System.out.println("Masukan Nama Pelanggan (Ketik 'Batal' untuk Keluar): ");
            np =s.nextLine();
            if (np.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.println("Jumlah Kopi: ");
            kopi= s.nextInt();
            System.out.println("Jumlah  Teh: ");
            teh= s.nextInt();
            System.out.println("Jumlah Roti: ");
            roti = s.nextInt();
            th=(kopi*hargaK)+(teh*hargaT)+(roti*hargaR);
            System.out.println("Total yang harus dibayar: Rp "+th);
            s.nextLine();
        }while(true);
        System.out.println("Semua Transaksi Selesai");
    }
}
