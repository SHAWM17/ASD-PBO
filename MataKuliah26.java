public class MataKuliah26 {
    String kodeMK, nama;
    int sks, jumlahJam;
    public MataKuliah26(){
    }
    public MataKuliah26(String nama, String kodeMK, int sks, int jumlahJam){
        this.nama = nama;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tampilkanInfo(){
        System.out.println("Mata Kuliah: " + nama);
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("SKS: " + sks);
        System.out.println("jumlahJam: " + jumlahJam);
    }
    String ubahSKS (int sksBaru){
        sks = sksBaru;
        return "SKS telah diubah";
    }
    void tambahJam(int jam){
        jumlahJam += jam;
    }

    String kurangiJam (int jam){
        if (jumlahJam < jam){
            return "pengurangan tidak dapat dilakukan";
        } else {
            jumlahJam -= jam;
            return "pengurangan jam telah diperbarui";
        }
    }
}
