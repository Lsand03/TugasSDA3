package TugasSDA3;
import java.util.LinkedList;

public class tugas3 {
    public static void main(String[] args) {
    //Membuat variabel linkedlist
    LinkedList<String> nim = new LinkedList<>();
    LinkedList<String> nama = new LinkedList<>();
    LinkedList<String> alamat = new LinkedList<>();

    //Menambah elemen
    System.out.println("Menambah elemen :");
    nim.add("2111522028");
    nim.add("2111521015");
    nim.add("2111112031");

    nama.add("Afif");
    nama.add("Fikri");
    nama.add("Afdil");

    alamat.add("Bukittinggi");
    alamat.add("Pasaman");
    alamat.add("Padang");

    System.out.println("NIM : "+nim+" Ukuran : "+nim.size());
    System.out.println("Nama : "+nama+" Ukuran : "+nama.size());
    System.out.println("Alamat : "+alamat+" Ukuran : "+alamat.size());
    System.out.println("=============================\n");

    //Menyisipkan data
    System.out.println("Menyisipkan data:");
    System.out.println("Data NIM Awal : "+nim+" Ukuran : "+nim.size());
    nim.add(1, "2111522099");
    nim.add(2, "2111522100");
    nim.add(4, "2111522101");

    System.out.println("NIM setelah penyisipan: "+nim+" Ukuran : "+nim.size());
    System.out.println("=============================\n");

    //Mengganti data
    System.out.println("Mengganti data :");
    System.out.println("Data Nama awal : "+nama+" Ukuran :"+nama.size());
    nama.set(0, "Elsanda");
    nama.set(2, "Rosaldi");

    System.out.println("Nama setelah penggantian : "+nama+" Ukuran : "+nama.size());
    System.out.println("=============================\n");

    //Menghapus data
    System.out.println("Menghapus data elemen awal dan akhir :");
    //First dan Last
    System.out.println("Data Alamat awal : "+alamat+" Ukuran : "+alamat.size());
    alamat.removeFirst();
    alamat.removeLast();

    System.out.println("Data Alamat setelah remove : "+alamat+" Ukuran : "+alamat.size());
    System.out.println("=============================\n");

    //Berdasarkan index
    System.out.println("Menghapus data berdasarkan index :");
    System.out.println("Data NIM awal : "+nim+" Ukuran : "+nim.size());
    nim.remove(2);
    nim.remove(3);

    System.out.println("Data NIM setelah remove : "+nim+" Ukuran : "+nim.size());
    System.out.println("=============================\n");

    //Hapus semua elemen
    System.out.println("Menghapus semua data :");
    System.out.println("Data NIM awal : "+nim+" Ukuran : "+nim.size());
    nim.clear();

    System.out.println("Data NIM setelah remove : "+nim+" Ukuran : "+nim.size());
    System.out.println("=============================\n");

    //Pengecekan apakah linkedlist kosong
    System.out.println("Cek elemen linkedlist :");
    //Cek LinkedList Nama
    Boolean cekNama = nama.isEmpty();
    if (cekNama) {
        System.out.println("LinkedList Nama Kosong");
    }else{
        System.out.println("LinkedList Nama memiliki "+nama.size()+" elemen");
    }

    //Cek LinkedList NIM
    Boolean cekNim = nim.isEmpty();
    if (cekNim) {
        System.out.println("LinkedList NIM Kosong");
    } else {
        System.out.println("LinkedList NIM memiliki "+nim.size()+" elemen");
    }

    //Cek LinkedList Alamat
    Boolean cekAlamat = alamat.isEmpty();
    if (cekAlamat) {
        System.out.println("LinkedList Alamat Kosong");
    } else {
        System.out.println("LinkedList Alamat memiliki "+alamat.size()+" elemen");
    }
    System.out.println("=============================\n");

    //Mengambil elemen dalam LinkedList
    System.out.println("Ambil elemen berdasarkan index :");
    //Berdasarkan index
    System.out.println("Elemen nama saat ini adalah : "+nama);
    System.out.println("Elemen nama pada index 0 adalah : "+nama.get(0));
    System.out.println("Elemen nama pada index 1 adalah : "+nama.get(1));
    System.out.println("Elemen nama pada index 2 adalah : "+nama.get(2));

    //First dan Last
    System.out.println("\nMengambil elemen awal dan akhir linkedlist : "+nama);
    System.out.println("Elemen nama pada index awal adalah : "+nama.getFirst());
    System.out.println("Elemen nama pada index akhir adalah : "+nama.getLast());

    System.out.println("=============================\n");
    
    }



}
