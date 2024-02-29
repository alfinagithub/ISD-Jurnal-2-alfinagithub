import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        GenArrayList<ATK> items = new GenArrayList<>();
        GenArrayList<Bag> items1 = new GenArrayList<>();

        items.addData(new ATK("A001", "Spidol", "Snowmna Board Maker", 70));
        items.addData(new ATK("A002", "Alat Tulis", "Pensil", 60));
        items.addData(new ATK("A003", "Alat Tulis", "Pulpen", 60));
        items.addData(new ATK("B001", "Buku", "Buku Tulis", 50));
        items.addData(new ATK("B002", "Kertas", "HVS", 40));
        items.addData(new ATK("B003", "Kertas", "Karton", 30));
        items1.addData(new Bag("C001", "Peralatan Sekolah", "Tempat Pensil", 70));
        items1.addData(new Bag("C002", "Peralatan Sekolah", "Tas", 10));
        items1.addData(new Bag("C003", "Peralatan Sekolah", "Sepatu", 3));
        items1.addData(new Bag("C004", "Peralatan Sekolah", "Laptop", 10));
        items1.addData(new Bag("C005", "Peralatan Sekolah", "Seragam", 10));

        System.out.println("Isi data ATK:");
        items.removeData("A002");
        items1.removeData("C004");
        items.display();

        System.out.println("Isi data Bag:");
        items1.display();
    }
}
