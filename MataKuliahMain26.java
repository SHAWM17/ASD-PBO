public class MataKuliahMain26 {
    public static void main(String[] args) {
        MataKuliah26 mk1 = new MataKuliah26();
        mk1.nama = "Algoritma dan Stutur Data";
        mk1.kodeMK = "ASD2";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        mk1.tampilkanInfo();
        System.out.println(mk1.ubahSKS(4));
        mk1.tampilkanInfo();

        MataKuliah26 mk2 = new MataKuliah26("Sistem Operasi", "SO2", 3, 4);
        mk2.tampilkanInfo();
        System.out.println(mk2.kurangiJam(2));
        mk2.tambahJam(3);
        mk2.tampilkanInfo();
    }
}
