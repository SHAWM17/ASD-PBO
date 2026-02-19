public class MahasiswaMain26 {
    public static void main(String[] args) {
        Mahasiswa26 mhs1 = new Mahasiswa26();
        mhs1.nama = "Saumi Yahya Suryadi";
        mhs1.nim = "254107020137";
        mhs1.kelas = "TI 1D";
        mhs1.ipk = 3.70;
        mhs1.tampilkanInfo();
        mhs1.ubahKelas("TI 2D");
        System.out.println(mhs1.updateIPK(4.5));
        mhs1.tampilkanInfo();

        Mahasiswa26 mhs2 = new Mahasiswa26("M. Attaqi Fadhil", "254123020321", 3.50, "TI 1D");
        mhs2.updateIPK(3.8);
        mhs2.tampilkanInfo();
    }
}
