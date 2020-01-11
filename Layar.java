import java.util.Scanner;
import java.util.ArrayList;

public class Layar {
  Scanner scan;

  Layar() {
    scan = new Scanner(System.in);
  }

  private void line() {
    System.out.println("============================");
  }

  private void sapa() {
    line();
    System.out.println("Restoran Siap Saji");
    line();
  }

  int menu(ArrayList<Makanan> makanan) {
    sapa();

    for(int i = 0; i < makanan.size(); i++) {
      System.out.println((i + 1) + ". " + makanan.get(i).nama);
    }

    System.out.print("Pilihan Anda : ");
    int pilihan = scan.nextInt();
    return pilihan - 1;
  }

  char lagi() {
    line();
    System.out.print("Pesan lagi (y/t)? ");
    char lagi = scan.next().charAt(0);
    return lagi;
  }

  void total(ArrayList<Makanan> pesanan) {
    line();

    System.out.println("Anda memesan: ");
    int total = 0;
    for(int i = 0; i < pesanan.size(); i++) {
      System.out.println((i + 1) + ". " + pesanan.get(i).nama);
      total += pesanan.get(i).harga;
    }

    System.out.println("Total: " + total);
  }

  void selesai() {
    line();
    System.out.println("Terima kasih :)");
  }
}
