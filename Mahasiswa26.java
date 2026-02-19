public class Mahasiswa26 {
    String nama;
    String nim;
    String kelas;
    double ipk;
    void tampilkanInfo () {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    void ubahKelas (String kelasBaru){
        kelas = kelasBaru;
    }
    String updateIPK (double ipkBaru){
        if (ipkBaru < 0.0 || ipkBaru > 4.0){
            return "IPK tidak valid!";
        } else {
            ipk = ipkBaru;
            return "IPK sudah diperbarui";
        }
    }

    String nilaiKinerja (){
        if (ipk >= 3.5){
            return  "Kinerja sangat baik";
        } else if (ipk >= 3.0){
            return "kinerja baik";
        } else if ( ipk >= 2.0){
            return "Kinerja cukup";
        } else {
            return "kinerja kurang";
        }
    }
}