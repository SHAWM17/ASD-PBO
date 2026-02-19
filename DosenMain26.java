public class DosenMain26 {
    public static void main(String[] args) {
        Dosen26 ds1 = new Dosen26();
        ds1.idDosen = "D01";
        ds1.nama = "M. Hasyim Ratsanjani";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2015;
        ds1.bidangKeahlian = "Sistem Operasi";

        ds1.tampilInformasi();
        ds1.setStatusAktif(false);
        ds1.ubahKeahlian("Data Science");
        System.out.println("Masa Kerja: " + ds1.hitungMasaKerja(2026) + " tahun");
        ds1.tampilInformasi();

        System.out.println();

        Dosen26 ds2 = new Dosen26("D02", "Adevian Fairuz Pratama", true, 2010, "Aljabar Linier");
        ds2.tampilInformasi();
        System.out.println("Masa Kerja: " + ds2.hitungMasaKerja(2026) + " tahun");
    }
}
