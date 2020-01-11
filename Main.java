import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Layar layar = new Layar();
    int pilihan = 0;

    ArrayList<Makanan> makanan = listMakanan();
    ArrayList<Makanan> pesanan = new ArrayList<>();
    while(pilihan < makanan.size()) {
      pilihan = layar.menu(makanan);

      if (pilihan < makanan.size()) {
        pesanan.add(makanan.get(pilihan));
        char lagi = layar.lagi();

        if (lagi == 'y' || lagi == 'Y') {
        } else {
          layar.total(pesanan);
          pilihan = makanan.size() + 1;
        }
      }
    }

    layar.selesai();
  }

  public static ArrayList<Makanan> listMakanan() {
    ArrayList<Makanan> makanan = new ArrayList<>();
    makanan.add(new Makanan("Pecel", 6000));
    makanan.add(new Makanan("Nasi Goreng", 7000));
    makanan.add(new Makanan("Soto", 5000));
    return makanan;
  }
}
